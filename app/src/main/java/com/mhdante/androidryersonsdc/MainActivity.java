package com.mhdante.androidryersonsdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity{
    //LinearLayout l;
    ListView l;
    int i;

    List<String> myList = Arrays.asList("John", "Alden", "Ian", "Zack", "Eugene", "Alksne", "Harris", "Manzor");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("", "onCreate");

        setContentView(R.layout.activity_main);
        //l = (LinearLayout) findViewById(R.id.things);
        l = (ListView) findViewById(R.id.exampleList);
//      ArrayAdapter<String> a = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, myList);
        ListAdapter a = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, myList);



        ListAdapter aa = new BaseAdapter() {

            int i;

            @Override
            public int getCount() {
                return myList.size();
            }

            @Override
            public Object getItem(int position) {
                return myList.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View v = LayoutInflater.from(MainActivity.this).inflate(android.R.layout.simple_list_item_1,null);
                TextView tv = (TextView)v;// new TextView(MainActivity.this);
                tv.setText(myList.get(position).toString());

//                i++; //local
//                //same as this.i++;
//                MainActivity.this.i++; //the containing class'

                return tv;
            }
        };

        l.setAdapter(a);

        Button b = (Button) findViewById(R.id.mainbutton);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i>3){
                    Intent i = new Intent(getApplicationContext(),FragmentTester.class);
                    startActivity(i);
                }

                //Manually add these things:
//                TextView t = new TextView(MainActivity.this);
//                t.setText("Goddamit.");
//                l.addView(t);

                //
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("", "onStart");
        TextView tv = (TextView)super.findViewById(R.id.hi_world);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("", "onDestroy");
    }




}
