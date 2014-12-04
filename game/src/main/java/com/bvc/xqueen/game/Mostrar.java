package com.bvc.xqueen.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by RISBO on 17/11/14.
 */
public class Mostrar extends Activity {

    TextView textInicio;
    /*RadioButton rb4;
    RadioButton rb5;
    RadioButton rb7;
    RadioButton rb8;
    */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar);

        Button btnIr=(Button)findViewById(R.id.btnIr);

        textInicio=(TextView)findViewById(R.id.textAyuda);
/*
        rb4=(RadioButton)findViewById(R.id.radioTablero4);
        rb5=(RadioButton)findViewById(R.id.radioTablero5);
        rb7=(RadioButton)findViewById(R.id.radioTablero7);
        rb8=(RadioButton)findViewById(R.id.radioTablero8);
*/

        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                int numero=0;

                if(rb4.isChecked()){
                    textInicio.setText("Seleccione el 4");
                    numero=4;
                }else if(rb5.isChecked()){
                    textInicio.setText("Seleccione el 5");
                    numero=5;
                }else if(rb7.isChecked()){
                    textInicio.setText("Seleccione el 7");
                    numero=7;
                }else if(rb8.isChecked()){
                    textInicio.setText("Seleccione el 8");
                    numero=8;
                }*/

                Intent intent = new Intent("com.bvc.xqueen.game.MOSTRAR_AYUDA");
               //intent.putExtra("numero", numero);
                startActivity(intent);





            }
        });
    }

}

