package com.belatrix.matt.leccion1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button btnGenerateLines = (Button) findViewById(R.id.btnGenerateLines);
        final EditText txtNumberLines = (EditText) findViewById(R.id.txtNumberLines);
        final LinearLayout linearLayoutContainer = (LinearLayout) findViewById(R.id.linearLayoutContainer);

        btnGenerateLines.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Integer txtFieldVal = Integer.valueOf(txtNumberLines.getText().toString());

                for (int i = 1; i <= txtFieldVal; i++){
                    TextView textView = new TextView(Main2Activity.this);
                    textView.setText("Linea " + i);
                    textView.setBackgroundColor(Color.parseColor("#FF0000"));
                    textView.setTextColor(Color.parseColor("#00FF00"));
                    linearLayoutContainer.addView(textView);
                }
                counter++;
            }
        });
    }
}
