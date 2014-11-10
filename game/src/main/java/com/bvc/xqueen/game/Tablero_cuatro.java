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

import java.util.ArrayList;

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

    int posibles;
    //ArrayList lista = new ArrayList();
    ArrayList<String> lista = new ArrayList<String>();

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



        Button btnComp=(Button)findViewById(R.id.btnComp1);
        btnComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Antes");
                System.out.println(lista);
                lista.clear();
                System.out.println("Despues");
                System.out.println(lista);

                     if(cc11.isChecked()){if(!lista.equals("1,1"))lista.add("1,1");}
                else if(cc12.isChecked()){if(!lista.equals("1,2"))lista.add("1,2");}
                else if(cc13.isChecked()){if(!lista.equals("1,3"))lista.add("1,3");}
                else if(cc14.isChecked()){if(!lista.equals("1,4"))lista.add("1,4");}

                     if(cc21.isChecked()){if(!lista.equals("2,1"))lista.add("2,1");}
                else if(cc22.isChecked()){if(!lista.equals("2,2"))lista.add("2,2");}
                else if(cc23.isChecked()){if(!lista.equals("2,3"))lista.add("2,3");}
                else if(cc24.isChecked()){if(!lista.equals("2,4"))lista.add("2,4");}

                     if(cc31.isChecked()){if(!lista.equals("3,1"))lista.add("3,1");}
                else if(cc32.isChecked()){if(!lista.equals("3,2"))lista.add("3,2");}
                else if(cc33.isChecked()){if(!lista.equals("3,3"))lista.add("3,3");}
                else if(cc34.isChecked()){if(!lista.equals("3,4"))lista.add("3,4");}

                     if(cc41.isChecked()){if(!lista.equals("4,1"))lista.add("4,1");}
                else if(cc42.isChecked()){if(!lista.equals("4,2"))lista.add("4,2");}
                else if(cc43.isChecked()){if(!lista.equals("4,3"))lista.add("4,3");}
                else if(cc44.isChecked()){if(!lista.equals("4,4"))lista.add("4,4");}

                System.out.println("final");
                System.out.println(lista);

            }
        });



        Reina reinas= new Reina(4);
        reinas.buscarSoluciones();
        ArrayList soluciones = reinas.getSoluciones();

        System.out.println(soluciones);

        for (int i = 0; i<soluciones.size();i++){
            int[] aux  = (int[]) soluciones.get(i);
            System.out.println("Solucion " + (i+1) + ":");
            for (int j = 0; j<aux.length;j++){
                System.out.print("(" + (j+1) + "," + (aux[j]+1) + ")");
            }
            System.out.println("");
        }

        //Le asignamos colores a los background del checkbox
        mostrarColores();


        //TextView txt=(TextView)findViewById(R.id.textTest);
        //txt.setText("hoa llegamos bien");

    }
    /**  movimientos de la pantalla
     * para despues tratar de contar los movimientos
    public static final String DEBUG_TAG = "GesturesActivity";
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub

        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                Log.d(DEBUG_TAG, "La accion ha sido ABAJO");
                return true;
            case (MotionEvent.ACTION_MOVE):
                Log.d(DEBUG_TAG, "La acción ha sido MOVER");
                return true;
            case (MotionEvent.ACTION_UP):
                Log.d(DEBUG_TAG, "La acción ha sido ARRIBA");

                return true;
            case (MotionEvent.ACTION_CANCEL):
                Log.d(DEBUG_TAG, "La accion ha sido CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE):
                Log.d(DEBUG_TAG,
                        "La accion ha sido fuera del elemento de la pantalla");
                return true;
            default:
                return super.onTouchEvent(event);
        }
    }
**/
    public void mostrarColores(){
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


    }
}
