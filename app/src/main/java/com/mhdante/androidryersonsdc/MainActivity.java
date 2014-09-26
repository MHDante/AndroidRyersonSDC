package com.mhdante.androidryersonsdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity{

    private final String KEY_COUNTER = "Counter";
    ListView l;
    int i;

    List<String> myList = Arrays.asList("John","Alden","Ian","Zack","Eugene","Alksne","Harris","Manzor");



    boolean newInstance = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        newInstance =  true;
//        if(savedInstanceState != null){
//            i = savedInstanceState.getInt(KEY_COUNTER);
//        }
        setContentView(R.layout.activity_main);
        l = (ListView) findViewById(R.id.exampleList);

        ListAdapter a = new BaseAdapter() {
            int i;
            @Override
            public int getCount() {
                return myList.size();
            }

            @Override
            public Object getItem(int i) {
                return myList.get(i);
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                View v =LayoutInflater.from(MainActivity.this).inflate(android.R.layout.simple_list_item_1,null);
                TextView tv = (TextView)v;
                tv.setText(getItem(i).toString());
                return tv;
            }
        } ;


        l.setAdapter(a);


        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i>10){
                    Intent i = new Intent(getApplicationContext(),CongratulationsActivity.class);
                    startActivity(i);
                }
                //TextView t = new TextView(MainActivity.this);
                //t.setText("Goddamit.");
                //l.addView(t);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView tv = (TextView)super.findViewById(R.id.hi_message);
        if (newInstance){
            tv.setText(getResources().getString(R.string.hello_world));
            newInstance = false;
        } else{
            tv.setText("Welcome Back");
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
//        outState.putInt(KEY_COUNTER, i);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}