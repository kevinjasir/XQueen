package com.bvc.xqueen.game;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by RISBO on 10/11/14.
 */
public class Tablero_cuatro extends Activity {

    CheckBox cc11;
    CheckBox cc12;
    CheckBox cc13;
    CheckBox cc14;

    CheckBox cc21;
    CheckBox cc22;
    CheckBox cc23;
    CheckBox cc24;

    CheckBox cc31;
    CheckBox cc32;
    CheckBox cc33;
    CheckBox cc34;

    CheckBox cc41;
    CheckBox cc42;
    CheckBox cc43;
    CheckBox cc44;
    TextView textTest;


    ArrayList<String> lista = new ArrayList<String>();
    ArrayList<String[]> lista_reinas = new ArrayList<String[]>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablero_cuatro);

         cc11=(CheckBox)findViewById(R.id.cc11);
         cc12=(CheckBox)findViewById(R.id.cc12);
         cc13=(CheckBox)findViewById(R.id.cc13);
         cc14=(CheckBox)findViewById(R.id.cc14);

         cc21=(CheckBox)findViewById(R.id.cc21);
         cc22=(CheckBox)findViewById(R.id.cc22);
         cc23=(CheckBox)findViewById(R.id.cc23);
         cc24=(CheckBox)findViewById(R.id.cc24);

         cc31=(CheckBox)findViewById(R.id.cc31);
         cc32=(CheckBox)findViewById(R.id.cc32);
         cc33=(CheckBox)findViewById(R.id.cc33);
         cc34=(CheckBox)findViewById(R.id.cc34);

         cc41=(CheckBox)findViewById(R.id.cc41);
         cc42=(CheckBox)findViewById(R.id.cc42);
         cc43=(CheckBox)findViewById(R.id.cc43);
         cc44=(CheckBox)findViewById(R.id.cc44);

        textTest=(TextView)findViewById(R.id.textTest);




        Button btnComp=(Button)findViewById(R.id.btnComp1);
        btnComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //limpiando lista

                lista.clear();
                lista_reinas.clear();


                 if(cc11.isChecked()){if(!lista.equals("1,1"))lista.add("1,1");}
                 if(cc12.isChecked()){if(!lista.equals("1,2"))lista.add("1,2");}
                 if(cc13.isChecked()){if(!lista.equals("1,3"))lista.add("1,3");}

                 if(cc14.isChecked()){if(!lista.equals("1,4"))lista.add("1,4");}

                 if(cc21.isChecked()){if(!lista.equals("2,1"))lista.add("2,1");}
                 if(cc22.isChecked()){if(!lista.equals("2,2"))lista.add("2,2");}
                 if(cc23.isChecked()){if(!lista.equals("2,3"))lista.add("2,3");}
                 if(cc24.isChecked()){if(!lista.equals("2,4"))lista.add("2,4");}

                 if(cc31.isChecked()){if(!lista.equals("3,1"))lista.add("3,1");}
                 if(cc32.isChecked()){if(!lista.equals("3,2"))lista.add("3,2");}
                 if(cc33.isChecked()){if(!lista.equals("3,3"))lista.add("3,3");}
                 if(cc34.isChecked()){if(!lista.equals("3,4"))lista.add("3,4");}

                 if(cc41.isChecked()){if(!lista.equals("4,1"))lista.add("4,1");}
                 if(cc42.isChecked()){if(!lista.equals("4,2"))lista.add("4,2");}
                 if(cc43.isChecked()){if(!lista.equals("4,3"))lista.add("4,3");}
                 if(cc44.isChecked()){if(!lista.equals("4,4"))lista.add("4,4");}



                //soluciones
                Reina reinas= new Reina(4);
                reinas.buscarSoluciones();
                ArrayList soluciones = reinas.getSoluciones();

                for (int i = 0; i < soluciones.size();i++){
                    int[] aux  = (int[]) soluciones.get(i);

                    String [] sol = new  String[4];
                    for (int j = 0; j<aux.length;j++){
                        sol[j] = ""+((j+1)+","+(aux[j]+1));
                        //System.out.println("sol "+j+":"+""+((j+1)+","+(aux[j]+1)));
                    }
                    //System.out.println(i+"-"+Arrays.toString(sol));
                    //lista_reinas.add(i,sol);
                    lista_reinas.add(sol);

                }
//                System.out.println("======================================");
//                System.out.println("listaLocal: "+lista);
//                System.out.println("arr1: "+ Arrays.toString(lista_reinas.get(0)));
//                System.out.println("arr0: "+ Arrays.toString(lista_reinas.get(1)));

                //saluciones para pruebas
                //[1,3, 2,1, 3,4, 4,2]
                //[1,2, 2,4, 3,1, 4,3]

                boolean ganaste=false;
                for(int b=0;b<soluciones.size();b++ ){
                    String listaS = lista.toString();
                    String lista_rS=Arrays.toString(lista_reinas.get(b));
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
                    titulo2.setText("nivel fácil superado!!");

                    //************************************************************************
                    //hacer una alerta para ver si quiere seguir jugando o pasar al otro nivel

                }
                else{
                    textTest.setText("Perdiste");
                    titulo1.setText("Intentalo de nuevo");
                    limpiarCheckbox4x4();
                }

            }
        });



        //Le asignamos colores a los background del checkbox
        mostrarColores(15,12,15,12);

    }

    public void mostrarColores(int izq, int arriba,int der, int abajo){
    cc11.setBackgroundResource(R.drawable.negro);
    cc12.setBackgroundResource(R.drawable.rojo);
    cc13.setBackgroundResource(R.drawable.negro);
    cc14.setBackgroundResource(R.drawable.rojo);

    cc21.setBackgroundResource(R.drawable.rojo);
    cc22.setBackgroundResource(R.drawable.negro);
    cc23.setBackgroundResource(R.drawable.rojo);
    cc24.setBackgroundResource(R.drawable.negro);

    cc31.setBackgroundResource(R.drawable.negro);
    cc32.setBackgroundResource(R.drawable.rojo);
    cc33.setBackgroundResource(R.drawable.negro);
    cc34.setBackgroundResource(R.drawable.rojo);

    cc41.setBackgroundResource(R.drawable.rojo);
    cc42.setBackgroundResource(R.drawable.negro);
    cc43.setBackgroundResource(R.drawable.rojo);
    cc44.setBackgroundResource(R.drawable.negro);

       cc11.setPadding(izq,arriba,der,abajo);
       cc12.setPadding(izq,arriba,der,abajo);
       cc13.setPadding(izq,arriba,der,abajo);
       cc14.setPadding(izq,arriba,der,abajo);

       cc21.setPadding(izq,arriba,der,abajo);
       cc22.setPadding(izq,arriba,der,abajo);
       cc23.setPadding(izq,arriba,der,abajo);
       cc24.setPadding(izq,arriba,der,abajo);


       cc31.setPadding(izq,arriba,der,abajo);
       cc32.setPadding(izq,arriba,der,abajo);
       cc33.setPadding(izq,arriba,der,abajo);
       cc34.setPadding(izq,arriba,der,abajo);


       cc41.setPadding(izq,arriba,der,abajo);
       cc42.setPadding(izq,arriba,der,abajo);
       cc43.setPadding(izq,arriba,der,abajo);
       cc44.setPadding(izq,arriba,der,abajo);

    }

    private void limpiarCheckbox4x4(){
       cc11.setChecked(false);
       cc12.setChecked(false);
       cc13.setChecked(false);
       cc14.setChecked(false);


       cc21.setChecked(false);
       cc22.setChecked(false);
       cc23.setChecked(false);
       cc24.setChecked(false);


       cc31.setChecked(false);
       cc32.setChecked(false);
       cc33.setChecked(false);
       cc34.setChecked(false);


       cc41.setChecked(false);
       cc42.setChecked(false);
       cc43.setChecked(false);
       cc44.setChecked(false);

    }
}
