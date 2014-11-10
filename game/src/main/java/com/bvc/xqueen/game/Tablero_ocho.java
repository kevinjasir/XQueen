package com.bvc.xqueen.game;

/**
 * Created by RISBO on 10/11/14.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Tablero_ocho extends Activity {

    CheckBox c11;
    CheckBox c12;
    CheckBox c13;
    CheckBox c14;
    CheckBox c15;
    CheckBox c16;
    CheckBox c17;
    CheckBox c18;

    CheckBox c21;
    CheckBox c22;
    CheckBox c23;
    CheckBox c24;
    CheckBox c25;
    CheckBox c26;
    CheckBox c27;
    CheckBox c28;

    CheckBox c31;
    CheckBox c32;
    CheckBox c33;
    CheckBox c34;
    CheckBox c35;
    CheckBox c36;
    CheckBox c37;
    CheckBox c38;

    CheckBox c41;
    CheckBox c42;
    CheckBox c43;
    CheckBox c44;
    CheckBox c45;
    CheckBox c46;
    CheckBox c47;
    CheckBox c48;

    CheckBox c51;
    CheckBox c52;
    CheckBox c53;
    CheckBox c54;
    CheckBox c55;
    CheckBox c56;
    CheckBox c57;
    CheckBox c58;

    CheckBox c61;
    CheckBox c62;
    CheckBox c63;
    CheckBox c64;
    CheckBox c65;
    CheckBox c66;
    CheckBox c67;
    CheckBox c68;

    CheckBox c71;
    CheckBox c72;
    CheckBox c73;
    CheckBox c74;
    CheckBox c75;
    CheckBox c76;
    CheckBox c77;
    CheckBox c78;

    CheckBox c81;
    CheckBox c82;
    CheckBox c83;
    CheckBox c84;
    CheckBox c85;
    CheckBox c86;
    CheckBox c87;
    CheckBox c88;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablero_ocho);

        c11=(CheckBox)findViewById(R.id.c11);
        c12=(CheckBox)findViewById(R.id.c12);
        c13=(CheckBox)findViewById(R.id.c13);
        c14=(CheckBox)findViewById(R.id.c14);
        c15=(CheckBox)findViewById(R.id.c15);
        c16=(CheckBox)findViewById(R.id.c16);
        c17=(CheckBox)findViewById(R.id.c17);
        c18=(CheckBox)findViewById(R.id.c18);

        c21=(CheckBox)findViewById(R.id.c21);
        c22=(CheckBox)findViewById(R.id.c22);
        c23=(CheckBox)findViewById(R.id.c23);
        c24=(CheckBox)findViewById(R.id.c24);
        c25=(CheckBox)findViewById(R.id.c25);
        c26=(CheckBox)findViewById(R.id.c26);
        c27=(CheckBox)findViewById(R.id.c27);
        c28=(CheckBox)findViewById(R.id.c28);

        c31=(CheckBox)findViewById(R.id.c31);
        c32=(CheckBox)findViewById(R.id.c32);
        c33=(CheckBox)findViewById(R.id.c33);
        c34=(CheckBox)findViewById(R.id.c34);
        c35=(CheckBox)findViewById(R.id.c35);
        c36=(CheckBox)findViewById(R.id.c36);
        c37=(CheckBox)findViewById(R.id.c37);
        c38=(CheckBox)findViewById(R.id.c38);

        c41=(CheckBox)findViewById(R.id.c41);
        c42=(CheckBox)findViewById(R.id.c42);
        c43=(CheckBox)findViewById(R.id.c43);
        c44=(CheckBox)findViewById(R.id.c44);
        c45=(CheckBox)findViewById(R.id.c45);
        c46=(CheckBox)findViewById(R.id.c46);
        c47=(CheckBox)findViewById(R.id.c47);
        c48=(CheckBox)findViewById(R.id.c48);

        c51=(CheckBox)findViewById(R.id.c51);
        c52=(CheckBox)findViewById(R.id.c52);
        c53=(CheckBox)findViewById(R.id.c53);
        c54=(CheckBox)findViewById(R.id.c54);
        c55=(CheckBox)findViewById(R.id.c55);
        c56=(CheckBox)findViewById(R.id.c56);
        c57=(CheckBox)findViewById(R.id.c57);
        c58=(CheckBox)findViewById(R.id.c58);

        c61=(CheckBox)findViewById(R.id.c61);
        c62=(CheckBox)findViewById(R.id.c62);
        c63=(CheckBox)findViewById(R.id.c63);
        c64=(CheckBox)findViewById(R.id.c64);
        c65=(CheckBox)findViewById(R.id.c65);
        c66=(CheckBox)findViewById(R.id.c66);
        c67=(CheckBox)findViewById(R.id.c67);
        c68=(CheckBox)findViewById(R.id.c68);

        c71=(CheckBox)findViewById(R.id.c71);
        c72=(CheckBox)findViewById(R.id.c72);
        c73=(CheckBox)findViewById(R.id.c73);
        c74=(CheckBox)findViewById(R.id.c74);
        c75=(CheckBox)findViewById(R.id.c75);
        c76=(CheckBox)findViewById(R.id.c76);
        c77=(CheckBox)findViewById(R.id.c77);
        c78=(CheckBox)findViewById(R.id.c78);

        c81=(CheckBox)findViewById(R.id.c81);
        c82=(CheckBox)findViewById(R.id.c82);
        c83=(CheckBox)findViewById(R.id.c83);
        c84=(CheckBox)findViewById(R.id.c84);
        c85=(CheckBox)findViewById(R.id.c85);
        c86=(CheckBox)findViewById(R.id.c86);
        c87=(CheckBox)findViewById(R.id.c87);
        c88=(CheckBox)findViewById(R.id.c88);
        //Le asignamos colores a los background del checkbox
        mostrarColores();


        //TextView txt=(TextView)findViewById(R.id.textTest);
        //txt.setText("hoa llegamos bien");

    }

    public void mostrarColores(){
        c11.setBackgroundResource(R.drawable.negro);
        c12.setBackgroundResource(R.drawable.rojo);
        c13.setBackgroundResource(R.drawable.negro);
        c14.setBackgroundResource(R.drawable.rojo);
        c15.setBackgroundResource(R.drawable.negro);
        c16.setBackgroundResource(R.drawable.rojo);
        c17.setBackgroundResource(R.drawable.negro);
        c18.setBackgroundResource(R.drawable.rojo);

        c21.setBackgroundResource(R.drawable.rojo);
        c22.setBackgroundResource(R.drawable.negro);
        c23.setBackgroundResource(R.drawable.rojo);
        c24.setBackgroundResource(R.drawable.negro);
        c25.setBackgroundResource(R.drawable.rojo);
        c26.setBackgroundResource(R.drawable.negro);
        c27.setBackgroundResource(R.drawable.rojo);
        c28.setBackgroundResource(R.drawable.negro);

        c31.setBackgroundResource(R.drawable.negro);
        c32.setBackgroundResource(R.drawable.rojo);
        c33.setBackgroundResource(R.drawable.negro);
        c34.setBackgroundResource(R.drawable.rojo);
        c35.setBackgroundResource(R.drawable.negro);
        c36.setBackgroundResource(R.drawable.rojo);
        c37.setBackgroundResource(R.drawable.negro);
        c38.setBackgroundResource(R.drawable.rojo);

        c41.setBackgroundResource(R.drawable.rojo);
        c42.setBackgroundResource(R.drawable.negro);
        c43.setBackgroundResource(R.drawable.rojo);
        c44.setBackgroundResource(R.drawable.negro);
        c45.setBackgroundResource(R.drawable.rojo);
        c46.setBackgroundResource(R.drawable.negro);
        c47.setBackgroundResource(R.drawable.rojo);
        c48.setBackgroundResource(R.drawable.negro);

        c51.setBackgroundResource(R.drawable.negro);
        c52.setBackgroundResource(R.drawable.rojo);
        c53.setBackgroundResource(R.drawable.negro);
        c54.setBackgroundResource(R.drawable.rojo);
        c55.setBackgroundResource(R.drawable.negro);
        c56.setBackgroundResource(R.drawable.rojo);
        c57.setBackgroundResource(R.drawable.negro);
        c58.setBackgroundResource(R.drawable.rojo);

        c61.setBackgroundResource(R.drawable.rojo);
        c62.setBackgroundResource(R.drawable.negro);
        c63.setBackgroundResource(R.drawable.rojo);
        c64.setBackgroundResource(R.drawable.negro);
        c65.setBackgroundResource(R.drawable.rojo);
        c66.setBackgroundResource(R.drawable.negro);
        c67.setBackgroundResource(R.drawable.rojo);
        c68.setBackgroundResource(R.drawable.negro);

        c71.setBackgroundResource(R.drawable.negro);
        c72.setBackgroundResource(R.drawable.rojo);
        c73.setBackgroundResource(R.drawable.negro);
        c74.setBackgroundResource(R.drawable.rojo);
        c75.setBackgroundResource(R.drawable.negro);
        c76.setBackgroundResource(R.drawable.rojo);
        c77.setBackgroundResource(R.drawable.negro);
        c78.setBackgroundResource(R.drawable.rojo);

        c81.setBackgroundResource(R.drawable.rojo);
        c82.setBackgroundResource(R.drawable.negro);
        c83.setBackgroundResource(R.drawable.rojo);
        c84.setBackgroundResource(R.drawable.negro);
        c85.setBackgroundResource(R.drawable.rojo);
        c86.setBackgroundResource(R.drawable.negro);
        c87.setBackgroundResource(R.drawable.rojo);
        c88.setBackgroundResource(R.drawable.negro);
    }
}

