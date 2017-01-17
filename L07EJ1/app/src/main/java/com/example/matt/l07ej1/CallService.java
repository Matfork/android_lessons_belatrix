package com.example.matt.l07ej1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CallService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_service);

        Intent intent = new Intent(this, ServiceIntentEjemplo.class);
        startService(intent);
    }
}
