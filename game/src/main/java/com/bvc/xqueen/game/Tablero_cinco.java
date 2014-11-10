package com.bvc.xqueen.game;

/**
 * Created by RISBO on 10/11/14.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Tablero_cinco extends Activity {

    CheckBox c11;
    CheckBox c12;
    CheckBox c13;
    CheckBox c14;
    CheckBox c15;

    CheckBox c21;
    CheckBox c22;
    CheckBox c23;
    CheckBox c24;
    CheckBox c25;

    CheckBox c31;
    CheckBox c32;
    CheckBox c33;
    CheckBox c34;
    CheckBox c35;

    CheckBox c41;
    CheckBox c42;
    CheckBox c43;
    CheckBox c44;
    CheckBox c45;

    CheckBox c51;
    CheckBox c52;
    CheckBox c53;
    CheckBox c54;
    CheckBox c55;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablero_cinco);

        c11=(CheckBox)findViewById(R.id.c11);
        c12=(CheckBox)findViewById(R.id.c12);
        c13=(CheckBox)findViewById(R.id.c13);
        c14=(CheckBox)findViewById(R.id.c14);
        c15=(CheckBox)findViewById(R.id.c15);

        c21=(CheckBox)findViewById(R.id.c21);
        c22=(CheckBox)findViewById(R.id.c22);
        c23=(CheckBox)findViewById(R.id.c23);
        c24=(CheckBox)findViewById(R.id.c24);
        c25=(CheckBox)findViewById(R.id.c25);

        c31=(CheckBox)findViewById(R.id.c31);
        c32=(CheckBox)findViewById(R.id.c32);
        c33=(CheckBox)findViewById(R.id.c33);
        c34=(CheckBox)findViewById(R.id.c34);
        c35=(CheckBox)findViewById(R.id.c35);

        c41=(CheckBox)findViewById(R.id.c41);
        c42=(CheckBox)findViewById(R.id.c42);
        c43=(CheckBox)findViewById(R.id.c43);
        c44=(CheckBox)findViewById(R.id.c44);
        c45=(CheckBox)findViewById(R.id.c45);

        c51=(CheckBox)findViewById(R.id.c51);
        c52=(CheckBox)findViewById(R.id.c52);
        c53=(CheckBox)findViewById(R.id.c53);
        c54=(CheckBox)findViewById(R.id.c54);
        c55=(CheckBox)findViewById(R.id.c55);

        //Le asignamos colores a los background del checkbox
        mostrarColores(10,10,10,10);


        //TextView txt=(TextView)findViewById(R.id.textTest);
        //txt.setText("hoa llegamos bien");

    }

    public void mostrarColores(int izq, int arriba,int der, int abajo){
        c11.setBackgroundResource(R.drawable.negro);
        c12.setBackgroundResource(R.drawable.rojo);
        c13.setBackgroundResource(R.drawable.negro);
        c14.setBackgroundResource(R.drawable.rojo);
        c15.setBackgroundResource(R.drawable.negro);

        c21.setBackgroundResource(R.drawable.rojo);
        c22.setBackgroundResource(R.drawable.negro);
        c23.setBackgroundResource(R.drawable.rojo);
        c24.setBackgroundResource(R.drawable.negro);
        c25.setBackgroundResource(R.drawable.rojo);

        c31.setBackgroundResource(R.drawable.negro);
        c32.setBackgroundResource(R.drawable.rojo);
        c33.setBackgroundResource(R.drawable.negro);
        c34.setBackgroundResource(R.drawable.rojo);
        c35.setBackgroundResource(R.drawable.negro);

        c41.setBackgroundResource(R.drawable.rojo);
        c42.setBackgroundResource(R.drawable.negro);
        c43.setBackgroundResource(R.drawable.rojo);
        c44.setBackgroundResource(R.drawable.negro);
        c45.setBackgroundResource(R.drawable.rojo);

        c51.setBackgroundResource(R.drawable.negro);
        c52.setBackgroundResource(R.drawable.rojo);
        c53.setBackgroundResource(R.drawable.negro);
        c54.setBackgroundResource(R.drawable.rojo);
        c55.setBackgroundResource(R.drawable.negro);

        c11.setPadding(izq,arriba,der,abajo);
        c12.setPadding(izq,arriba,der,abajo);
        c13.setPadding(izq,arriba,der,abajo);
        c14.setPadding(izq,arriba,der,abajo);
        c15.setPadding(izq,arriba,der,abajo);

        c21.setPadding(izq,arriba,der,abajo);
        c22.setPadding(izq,arriba,der,abajo);
        c23.setPadding(izq,arriba,der,abajo);
        c24.setPadding(izq,arriba,der,abajo);
        c25.setPadding(izq,arriba,der,abajo);

        c31.setPadding(izq,arriba,der,abajo);
        c32.setPadding(izq,arriba,der,abajo);
        c33.setPadding(izq,arriba,der,abajo);
        c34.setPadding(izq,arriba,der,abajo);
        c35.setPadding(izq,arriba,der,abajo);

        c41.setPadding(izq,arriba,der,abajo);
        c42.setPadding(izq,arriba,der,abajo);
        c43.setPadding(izq,arriba,der,abajo);
        c44.setPadding(izq,arriba,der,abajo);
        c45.setPadding(izq,arriba,der,abajo);

        c51.setPadding(izq,arriba,der,abajo);
        c52.setPadding(izq,arriba,der,abajo);
        c53.setPadding(izq,arriba,der,abajo);
        c54.setPadding(izq,arriba,der,abajo);
        c55.setPadding(izq,arriba,der,abajo);

    }
}
