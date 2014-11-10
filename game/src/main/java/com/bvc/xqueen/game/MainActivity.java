package com.bvc.xqueen.game;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    RadioButton rb4;
    RadioButton rb5;
    RadioButton rb7;
    RadioButton rb8;

    Button btnComenzar;
    TextView textInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComenzar=(Button)findViewById(R.id.btnComenzar);

        textInicio=(TextView)findViewById(R.id.textInicio);

        rb4=(RadioButton)findViewById(R.id.radioB4);
        rb5=(RadioButton)findViewById(R.id.radioB5);
        rb7=(RadioButton)findViewById(R.id.radioB7);
        rb8=(RadioButton)findViewById(R.id.radioB8);

        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //textInicio.setText("hola");
                if(rb4.isChecked()){
                    textInicio.setText("Seleccione el 4");
                }else if(rb5.isChecked()){
                    textInicio.setText("Seleccione el 5");
                }else if(rb7.isChecked()){
                    textInicio.setText("Seleccione el 7");
                }else if(rb8.isChecked()){
                    textInicio.setText("Seleccione el 8");
                }

            }
        });


    }


}

