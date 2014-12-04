package com.bvc.xqueen.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by RISBO on 3/12/14.
 */
public class Mostrar_ayuda extends Activity {

    ArrayList<String> lista = new ArrayList<String>();
    ArrayList<String[]> lista_reinas = new ArrayList<String[]>();

    Spinner spSoluciones;


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
        setContentView(R.layout.mostrar_ayuda);

        /*Bundle extras = getIntent().getExtras();
        int numero = extras.getInt("numero");
        System.out.println(numero);
        */

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


        //soluciones
        int N=8;
        Reina reinas= new Reina(N);
        reinas.buscarSoluciones();
        ArrayList soluciones = reinas.getSoluciones();

        for (int i = 0; i < soluciones.size();i++){
            int[] aux  = (int[]) soluciones.get(i);

            String [] sol = new  String[N];
            for (int j = 0; j<aux.length;j++){
                sol[j] = ""+((j+1)+","+(aux[j]+1));
            }
            //System.out.println(i+"-"+Arrays.toString(sol));
            lista_reinas.add(sol);
        }

        //conviertiendo la lista en array
        String[] array = new String[lista_reinas.size()];
        for(int i = 0; i < lista_reinas.size(); i++){
            array[i] = "Sol: "+(i+1)+" -> "+Arrays.toString(lista_reinas.get(i));
            //System.out.println(array[i]);
        } //System.out.println(Arrays.toString(array));


        mostrarColores();

        spSoluciones= (Spinner)findViewById(R.id.spReinas);

        spSoluciones.setAdapter(new ArrayAdapter(this,R.layout.size_text,array));

       spSoluciones.setOnItemSelectedListener(new OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
              //System.out.println("hola: "+Arrays.toString(lista_reinas.get(arg2)));

                //limpiando y bloqueando checkbox
                limpiarCheckbox();
                bloquearCheckbox();

                //obteniendo valor seleccionado
                String cadena=Arrays.toString(lista_reinas.get(arg2));
                //reparando salida
                String[]cadenasp = cadena.split(", ");
                int x =cadenasp.length;
                for(int i = 0; i < x; i++){
                    if(i==0){cadenasp[i]=cadenasp[i].substring(1);}
                    if(i==(x-1)){cadenasp[i]=cadenasp[i].substring(0,3);}
                    //System.out.println("-->"+cadenasp[i]+"<--");

                    //limpiando checkbox, por si hubiese uno seleccionado;


                    //verificando si esta chequeado
                    if(cadenasp[i].trim().equals("1,1")){c11.setChecked(true);c11.setEnabled(true);}
                    if(cadenasp[i].trim().equals("1,2")){c12.setChecked(true);c12.setEnabled(true);}
                    if(cadenasp[i].trim().equals("1,3")){c13.setChecked(true);c13.setEnabled(true);}
                    if(cadenasp[i].trim().equals("1,4")){c14.setChecked(true);c14.setEnabled(true);}
                    if(cadenasp[i].trim().equals("1,5")){c15.setChecked(true);c15.setEnabled(true);}
                    if(cadenasp[i].trim().equals("1,6")){c16.setChecked(true);c16.setEnabled(true);}
                    if(cadenasp[i].trim().equals("1,7")){c17.setChecked(true);c17.setEnabled(true);}
                    if(cadenasp[i].trim().equals("1,8")){c18.setChecked(true);c18.setEnabled(true);}

                    if(cadenasp[i].trim().equals("2,1")){c21.setChecked(true);c21.setEnabled(true);}
                    if(cadenasp[i].trim().equals("2,2")){c22.setChecked(true);c22.setEnabled(true);}
                    if(cadenasp[i].trim().equals("2,3")){c23.setChecked(true);c23.setEnabled(true);}
                    if(cadenasp[i].trim().equals("2,4")){c24.setChecked(true);c24.setEnabled(true);}
                    if(cadenasp[i].trim().equals("2,5")){c25.setChecked(true);c25.setEnabled(true);}
                    if(cadenasp[i].trim().equals("2,6")){c26.setChecked(true);c26.setEnabled(true);}
                    if(cadenasp[i].trim().equals("2,7")){c27.setChecked(true);c27.setEnabled(true);}
                    if(cadenasp[i].trim().equals("2,8")){c28.setChecked(true);c28.setEnabled(true);}

                    if(cadenasp[i].trim().equals("3,1")){c31.setChecked(true);c31.setEnabled(true);}
                    if(cadenasp[i].trim().equals("3,2")){c32.setChecked(true);c32.setEnabled(true);}
                    if(cadenasp[i].trim().equals("3,3")){c33.setChecked(true);c33.setEnabled(true);}
                    if(cadenasp[i].trim().equals("3,4")){c34.setChecked(true);c34.setEnabled(true);}
                    if(cadenasp[i].trim().equals("3,5")){c35.setChecked(true);c35.setEnabled(true);}
                    if(cadenasp[i].trim().equals("3,6")){c36.setChecked(true);c36.setEnabled(true);}
                    if(cadenasp[i].trim().equals("3,7")){c37.setChecked(true);c37.setEnabled(true);}
                    if(cadenasp[i].trim().equals("3,8")){c38.setChecked(true);c38.setEnabled(true);}

                    if(cadenasp[i].trim().equals("4,1")){c41.setChecked(true);c41.setEnabled(true);}
                    if(cadenasp[i].trim().equals("4,2")){c42.setChecked(true);c42.setEnabled(true);}
                    if(cadenasp[i].trim().equals("4,3")){c43.setChecked(true);c43.setEnabled(true);}
                    if(cadenasp[i].trim().equals("4,4")){c44.setChecked(true);c44.setEnabled(true);}
                    if(cadenasp[i].trim().equals("4,5")){c45.setChecked(true);c45.setEnabled(true);}
                    if(cadenasp[i].trim().equals("4,6")){c46.setChecked(true);c46.setEnabled(true);}
                    if(cadenasp[i].trim().equals("4,7")){c47.setChecked(true);c47.setEnabled(true);}
                    if(cadenasp[i].trim().equals("4,8")){c48.setChecked(true);c48.setEnabled(true);}

                    if(cadenasp[i].trim().equals("5,1")){c51.setChecked(true);c51.setEnabled(true);}
                    if(cadenasp[i].trim().equals("5,2")){c52.setChecked(true);c52.setEnabled(true);}
                    if(cadenasp[i].trim().equals("5,3")){c53.setChecked(true);c53.setEnabled(true);}
                    if(cadenasp[i].trim().equals("5,4")){c54.setChecked(true);c54.setEnabled(true);}
                    if(cadenasp[i].trim().equals("5,5")){c55.setChecked(true);c55.setEnabled(true);}
                    if(cadenasp[i].trim().equals("5,6")){c56.setChecked(true);c56.setEnabled(true);}
                    if(cadenasp[i].trim().equals("5,7")){c57.setChecked(true);c57.setEnabled(true);}
                    if(cadenasp[i].trim().equals("5,8")){c58.setChecked(true);c58.setEnabled(true);}

                    if(cadenasp[i].trim().equals("6,1")){c61.setChecked(true);c61.setEnabled(true);}
                    if(cadenasp[i].trim().equals("6,2")){c62.setChecked(true);c62.setEnabled(true);}
                    if(cadenasp[i].trim().equals("6,3")){c63.setChecked(true);c63.setEnabled(true);}
                    if(cadenasp[i].trim().equals("6,4")){c64.setChecked(true);c64.setEnabled(true);}
                    if(cadenasp[i].trim().equals("6,5")){c65.setChecked(true);c65.setEnabled(true);}
                    if(cadenasp[i].trim().equals("6,6")){c66.setChecked(true);c66.setEnabled(true);}
                    if(cadenasp[i].trim().equals("6,7")){c67.setChecked(true);c67.setEnabled(true);}
                    if(cadenasp[i].trim().equals("6,8")){c68.setChecked(true);c68.setEnabled(true);}

                    if(cadenasp[i].trim().equals("7,1")){c71.setChecked(true);c71.setEnabled(true);}
                    if(cadenasp[i].trim().equals("7,2")){c72.setChecked(true);c72.setEnabled(true);}
                    if(cadenasp[i].trim().equals("7,3")){c73.setChecked(true);c73.setEnabled(true);}
                    if(cadenasp[i].trim().equals("7,4")){c74.setChecked(true);c74.setEnabled(true);}
                    if(cadenasp[i].trim().equals("7,5")){c75.setChecked(true);c75.setEnabled(true);}
                    if(cadenasp[i].trim().equals("7,6")){c76.setChecked(true);c76.setEnabled(true);}
                    if(cadenasp[i].trim().equals("7,7")){c77.setChecked(true);c77.setEnabled(true);}
                    if(cadenasp[i].trim().equals("7,8")){c78.setChecked(true);c78.setEnabled(true);}

                    if(cadenasp[i].trim().equals("8,1")){c81.setChecked(true);c81.setEnabled(true);}
                    if(cadenasp[i].trim().equals("8,2")){c82.setChecked(true);c82.setEnabled(true);}
                    if(cadenasp[i].trim().equals("8,3")){c83.setChecked(true);c83.setEnabled(true);}
                    if(cadenasp[i].trim().equals("8,4")){c84.setChecked(true);c84.setEnabled(true);}
                    if(cadenasp[i].trim().equals("8,5")){c85.setChecked(true);c85.setEnabled(true);}
                    if(cadenasp[i].trim().equals("8,6")){c86.setChecked(true);c86.setEnabled(true);}
                    if(cadenasp[i].trim().equals("8,7")){c87.setChecked(true);c87.setEnabled(true);}
                    if(cadenasp[i].trim().equals("8,8")){c88.setChecked(true);c88.setEnabled(true);}


                }
                //fin reparacion


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });


    }
    private void bloquearCheckbox(){
        c11.setEnabled(false);
        c12.setEnabled(false);
        c13.setEnabled(false);
        c14.setEnabled(false);
        c15.setEnabled(false);
        c16.setEnabled(false);
        c17.setEnabled(false);
        c18.setEnabled(false);

        c21.setEnabled(false);
        c22.setEnabled(false);
        c23.setEnabled(false);
        c24.setEnabled(false);
        c25.setEnabled(false);
        c26.setEnabled(false);
        c27.setEnabled(false);
        c28.setEnabled(false);

        c31.setEnabled(false);
        c32.setEnabled(false);
        c33.setEnabled(false);
        c34.setEnabled(false);
        c35.setEnabled(false);
        c36.setEnabled(false);
        c37.setEnabled(false);
        c38.setEnabled(false);

        c41.setEnabled(false);
        c42.setEnabled(false);
        c43.setEnabled(false);
        c44.setEnabled(false);
        c45.setEnabled(false);
        c46.setEnabled(false);
        c47.setEnabled(false);
        c48.setEnabled(false);

        c51.setEnabled(false);
        c52.setEnabled(false);
        c53.setEnabled(false);
        c54.setEnabled(false);
        c55.setEnabled(false);
        c56.setEnabled(false);
        c57.setEnabled(false);
        c58.setEnabled(false);

        c61.setEnabled(false);
        c62.setEnabled(false);
        c63.setEnabled(false);
        c64.setEnabled(false);
        c65.setEnabled(false);
        c66.setEnabled(false);
        c67.setEnabled(false);
        c68.setEnabled(false);

        c71.setEnabled(false);
        c72.setEnabled(false);
        c73.setEnabled(false);
        c74.setEnabled(false);
        c75.setEnabled(false);
        c76.setEnabled(false);
        c77.setEnabled(false);
        c78.setEnabled(false);

        c81.setEnabled(false);
        c82.setEnabled(false);
        c83.setEnabled(false);
        c84.setEnabled(false);
        c85.setEnabled(false);
        c86.setEnabled(false);
        c87.setEnabled(false);
        c88.setEnabled(false);
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
    private void limpiarCheckbox(){
        c11.setChecked(false);
        c12.setChecked(false);
        c13.setChecked(false);
        c14.setChecked(false);
        c15.setChecked(false);
        c16.setChecked(false);
        c17.setChecked(false);
        c18.setChecked(false);

        c21.setChecked(false);
        c22.setChecked(false);
        c23.setChecked(false);
        c24.setChecked(false);
        c25.setChecked(false);
        c26.setChecked(false);
        c27.setChecked(false);
        c28.setChecked(false);

        c31.setChecked(false);
        c32.setChecked(false);
        c33.setChecked(false);
        c34.setChecked(false);
        c35.setChecked(false);
        c36.setChecked(false);
        c37.setChecked(false);
        c38.setChecked(false);

        c41.setChecked(false);
        c42.setChecked(false);
        c43.setChecked(false);
        c44.setChecked(false);
        c45.setChecked(false);
        c46.setChecked(false);
        c47.setChecked(false);
        c48.setChecked(false);

        c51.setChecked(false);
        c52.setChecked(false);
        c53.setChecked(false);
        c54.setChecked(false);
        c55.setChecked(false);
        c56.setChecked(false);
        c57.setChecked(false);
        c58.setChecked(false);

        c61.setChecked(false);
        c62.setChecked(false);
        c63.setChecked(false);
        c64.setChecked(false);
        c65.setChecked(false);
        c66.setChecked(false);
        c67.setChecked(false);
        c68.setChecked(false);

        c71.setChecked(false);
        c72.setChecked(false);
        c73.setChecked(false);
        c74.setChecked(false);
        c75.setChecked(false);
        c76.setChecked(false);
        c77.setChecked(false);
        c78.setChecked(false);

        c81.setChecked(false);
        c82.setChecked(false);
        c83.setChecked(false);
        c84.setChecked(false);
        c85.setChecked(false);
        c86.setChecked(false);
        c87.setChecked(false);
        c88.setChecked(false);
    }
}
