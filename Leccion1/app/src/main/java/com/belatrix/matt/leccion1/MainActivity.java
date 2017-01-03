package com.belatrix.matt.leccion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonOne = (Button) findViewById(R.id.btnCalcularMes);
        final Button buttonTwo = (Button) findViewById(R.id.btnCalcular);

        final Button goNextactivity = (Button) findViewById(R.id.btnNextActivity);

        final EditText txtFieldOne = (EditText) findViewById(R.id.txtFieldOne);
        final TextView textView = (TextView) findViewById(R.id.txtViewOne);

        final EditText txtNumberOne = (EditText) findViewById(R.id.txtNumber1);
        final EditText txtNumberTwo = (EditText) findViewById(R.id.txnNumber2);
        final EditText txtOperation = (EditText) findViewById(R.id.txtOperation);
        final TextView lblResultado = (TextView) findViewById(R.id.lblResultado);

        buttonOne.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Integer txtFieldVal = Integer.valueOf(txtFieldOne.getText().toString());
                String mes = "";

                Log.d("txtFieldVal",""+txtFieldVal);

                if(txtFieldVal != null){
                    switch (txtFieldVal){
                        case 1: mes = "Enero"; break;
                        case 2: mes = "Febrero"; break;
                        case 3: mes = "Marzo"; break;
                        case 4: mes = "Abril"; break;
                        case 5: mes = "Mayo"; break;
                        case 6: mes = "Junio"; break;
                        case 7: mes = "Julio"; break;
                        case 8: mes = "Agosto"; break;
                        case 9: mes = "Septiembre"; break;
                        case 10: mes = "Octubre"; break;
                        case 11: mes = "Nomviembre"; break;
                        case 12: mes = "Diciembre"; break;
                    }

                    textView.setText(mes);
                }
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener () {
            public void onClick(View view) {
                Double n1 = Double.parseDouble(txtNumberOne.getText().toString());
                Double n2 = Double.parseDouble(txtNumberTwo.getText().toString());
                char op = txtOperation.getText().toString().charAt(0);
                Double result = 0.0;

                switch (op ){
                    case '+': result = n1 + n2; break;
                    case '-': result = n1 - n2; break;
                    case '*': result = n1 * n2; break;
                    case '/': result = n1 / n2; break;
                }

                Log.d("result",""+result);
                lblResultado.setText(String.valueOf(result));
            }
        });


        goNextactivity.setOnClickListener(new View.OnClickListener () {
            public void onClick(View view) {
                try
                {
                    Intent k = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(k);
                }catch(Exception e){}
            }
        });
    }

}

