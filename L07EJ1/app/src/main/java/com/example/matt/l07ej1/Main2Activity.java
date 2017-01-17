package com.example.matt.l07ej1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final Button btn3 = (Button) findViewById(R.id.btn3);
        final Button btnCallService = (Button) findViewById(R.id.btnCallService);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Main2Activity.this, ActividadC.class);
                Main2Activity.this.startActivity(myIntent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Main2Activity.this, ActividadD.class);
                Main2Activity.this.startActivity(myIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Main2Activity.this, ActividadE.class);
                Main2Activity.this.startActivity(myIntent);
            }
        });

        btnCallService.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Main2Activity.this, CallService.class);
                Main2Activity.this.startActivity(myIntent);
            }
        });
    }

}
