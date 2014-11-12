package com.bvc.xqueen.game;

/**
 * Created by RISBO on 10/11/14.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

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

    TextView textTest;

    ArrayList<String> lista = new ArrayList<String>();
    ArrayList<String[]> lista_reinas = new ArrayList<String[]>();

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

        textTest=(TextView)findViewById(R.id.textTest5);


        Button btnComp=(Button)findViewById(R.id.btnComp5);
        btnComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //limpiando lista

                lista.clear();
                lista_reinas.clear();


                if(c11.isChecked()){if(!lista.equals("1,1"))lista.add("1,1");}
                if(c12.isChecked()){if(!lista.equals("1,2"))lista.add("1,2");}
                if(c13.isChecked()){if(!lista.equals("1,3"))lista.add("1,3");}
                if(c14.isChecked()){if(!lista.equals("1,4"))lista.add("1,4");}
                if(c15.isChecked()){if(!lista.equals("1,5"))lista.add("1,5");}

                if(c21.isChecked()){if(!lista.equals("2,1"))lista.add("2,1");}
                if(c22.isChecked()){if(!lista.equals("2,2"))lista.add("2,2");}
                if(c23.isChecked()){if(!lista.equals("2,3"))lista.add("2,3");}
                if(c24.isChecked()){if(!lista.equals("2,4"))lista.add("2,4");}
                if(c25.isChecked()){if(!lista.equals("2,5"))lista.add("2,5");}

                if(c31.isChecked()){if(!lista.equals("3,1"))lista.add("3,1");}
                if(c32.isChecked()){if(!lista.equals("3,2"))lista.add("3,2");}
                if(c33.isChecked()){if(!lista.equals("3,3"))lista.add("3,3");}
                if(c34.isChecked()){if(!lista.equals("3,4"))lista.add("3,4");}
                if(c35.isChecked()){if(!lista.equals("3,5"))lista.add("3,5");}

                if(c41.isChecked()){if(!lista.equals("4,1"))lista.add("4,1");}
                if(c42.isChecked()){if(!lista.equals("4,2"))lista.add("4,2");}
                if(c43.isChecked()){if(!lista.equals("4,3"))lista.add("4,3");}
                if(c44.isChecked()){if(!lista.equals("4,4"))lista.add("4,4");}
                if(c45.isChecked()){if(!lista.equals("4,5"))lista.add("4,5");}

                if(c51.isChecked()){if(!lista.equals("5,1"))lista.add("5,1");}
                if(c52.isChecked()){if(!lista.equals("5,2"))lista.add("5,2");}
                if(c53.isChecked()){if(!lista.equals("5,3"))lista.add("5,3");}
                if(c54.isChecked()){if(!lista.equals("5,4"))lista.add("5,4");}
                if(c55.isChecked()){if(!lista.equals("5,5"))lista.add("5,5");}

                //soluciones
                int N=5;
                Reina reinas= new Reina(N);
                reinas.buscarSoluciones();
                ArrayList soluciones = reinas.getSoluciones();

                for (int i = 0; i < soluciones.size();i++){
                    int[] aux  = (int[]) soluciones.get(i);

                    String [] sol = new  String[N];
                    for (int j = 0; j<aux.length;j++){
                        sol[j] = ""+((j+1)+","+(aux[j]+1));
                        //System.out.println("sol "+j+":"+""+((j+1)+","+(aux[j]+1)));
                    }
                    //System.out.println(i+"-"+Arrays.toString(sol));
                    //lista_reinas.add(i,sol);
                    lista_reinas.add(sol);

                }
                /*
                System.out.println("======================================");
                System.out.println("listaLocal: "+lista);
                for(int i=0;i<soluciones.size();i++)
                System.out.println("arr"+i+":"+ Arrays.toString(lista_reinas.get(i)));
                */

                /*
                //soluciones para pruebas
                [1,1, 2,3, 3,5, 4,2, 5,4]
                [1,1, 2,4, 3,2, 4,5, 5,3]
                [1,2, 2,4, 3,1, 4,3, 5,5]
                [1,2, 2,5, 3,3, 4,1, 5,4]
                [1,3, 2,1, 3,4, 4,2, 5,5]
                [1,3, 2,5, 3,2, 4,4, 5,1]
                [1,4, 2,1, 3,3, 4,5, 5,2]
                [1,4, 2,2, 3,5, 4,3, 5,1]
                [1,5, 2,2, 3,4, 4,1, 5,3]
                [1,5, 2,3, 3,1, 4,4, 5,2]
                */


                boolean ganaste=false;
                for(int b=0;b<soluciones.size();b++ ){
                    String listaS = lista.toString();
                    String lista_rS= Arrays.toString(lista_reinas.get(b));
                    if(listaS.equals(lista_rS)){
                        ganaste=true;
                        break;
                    }else{
                        ganaste=false;

                    }
                }

                TextView titulo1 = (TextView)findViewById(R.id.textView1);
                TextView titulo2 = (TextView)findViewById(R.id.textView2);

                if(ganaste){
                    textTest.setText("Ganaste!!");
                    titulo1.setText("Felicidades Ganaste!!!");
                    titulo2.setText("nivel medio superado!!");

                    //************************************************************************
                    //hacer una alerta para ver si quiere seguir jugando o pasar al otro nivel

                }
                else{
                    textTest.setText("L");
                    limpiarCheckbox5x5();
                }

            }
        });


        //Le asignamos colores a los background del checkbox
        mostrarColores(13,10,13,10);


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

    private void limpiarCheckbox5x5(){
        c11.setChecked(false);
        c12.setChecked(false);
        c13.setChecked(false);
        c14.setChecked(false);
        c15.setChecked(false);

        c21.setChecked(false);
        c22.setChecked(false);
        c23.setChecked(false);
        c24.setChecked(false);
        c25.setChecked(false);


        c31.setChecked(false);
        c32.setChecked(false);
        c33.setChecked(false);
        c34.setChecked(false);
        c35.setChecked(false);


        c41.setChecked(false);
        c42.setChecked(false);
        c43.setChecked(false);
        c44.setChecked(false);
        c45.setChecked(false);


        c51.setChecked(false);
        c52.setChecked(false);
        c53.setChecked(false);
        c54.setChecked(false);
        c55.setChecked(false);

    }

}
