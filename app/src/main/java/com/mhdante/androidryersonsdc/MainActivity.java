package com.mhdante.androidryersonsdc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity{
    LinearLayout l;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (LinearLayout) findViewById(R.id.things);



        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i>10){
                    Intent i = new Intent(getApplicationContext(),CongratulationsActivity.class);
                    startActivity(i);
                }
                TextView t = new TextView(MainActivity.this);
                t.setText("Goddamit.");
                l.addView(t);
            }
        });
    }
}