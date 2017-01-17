package com.example.matt.l07ej1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.iv1);
        ImageView img2 = (ImageView) findViewById(R.id.iv2);
        ImageView img3 = (ImageView) findViewById(R.id.iv3);

        img.setOnClickListener(onClickListener);
        img2.setOnClickListener(onClickListener);
        img3.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //v.getId()
            Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);
            MainActivity.this.startActivity(myIntent);
        }
    };
}
