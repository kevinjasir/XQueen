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

public class Tablero_siete extends Activity {

    CheckBox c11;
    CheckBox c12;
    CheckBox c13;
    CheckBox c14;
    CheckBox c15;
    CheckBox c16;
    CheckBox c17;

    CheckBox c21;
    CheckBox c22;
    CheckBox c23;
    CheckBox c24;
    CheckBox c25;
    CheckBox c26;
    CheckBox c27;

    CheckBox c31;
    CheckBox c32;
    CheckBox c33;
    CheckBox c34;
    CheckBox c35;
    CheckBox c36;
    CheckBox c37;

    CheckBox c41;
    CheckBox c42;
    CheckBox c43;
    CheckBox c44;
    CheckBox c45;
    CheckBox c46;
    CheckBox c47;

    CheckBox c51;
    CheckBox c52;
    CheckBox c53;
    CheckBox c54;
    CheckBox c55;
    CheckBox c56;
    CheckBox c57;

    CheckBox c61;
    CheckBox c62;
    CheckBox c63;
    CheckBox c64;
    CheckBox c65;
    CheckBox c66;
    CheckBox c67;

    CheckBox c71;
    CheckBox c72;
    CheckBox c73;
    CheckBox c74;
    CheckBox c75;
    CheckBox c76;
    CheckBox c77;

    TextView textTest;
    ArrayList<String> lista = new ArrayList<String>();
    ArrayList<String[]> lista_reinas = new ArrayList<String[]>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablero_siete);

        c11=(CheckBox)findViewById(R.id.c11);
        c12=(CheckBox)findViewById(R.id.c12);
        c13=(CheckBox)findViewById(R.id.c13);
        c14=(CheckBox)findViewById(R.id.c14);
        c15=(CheckBox)findViewById(R.id.c15);
        c16=(CheckBox)findViewById(R.id.c16);
        c17=(CheckBox)findViewById(R.id.c17);

        c21=(CheckBox)findViewById(R.id.c21);
        c22=(CheckBox)findViewById(R.id.c22);
        c23=(CheckBox)findViewById(R.id.c23);
        c24=(CheckBox)findViewById(R.id.c24);
        c25=(CheckBox)findViewById(R.id.c25);
        c26=(CheckBox)findViewById(R.id.c26);
        c27=(CheckBox)findViewById(R.id.c27);

        c31=(CheckBox)findViewById(R.id.c31);
        c32=(CheckBox)findViewById(R.id.c32);
        c33=(CheckBox)findViewById(R.id.c33);
        c34=(CheckBox)findViewById(R.id.c34);
        c35=(CheckBox)findViewById(R.id.c35);
        c36=(CheckBox)findViewById(R.id.c36);
        c37=(CheckBox)findViewById(R.id.c37);

        c41=(CheckBox)findViewById(R.id.c41);
        c42=(CheckBox)findViewById(R.id.c42);
        c43=(CheckBox)findViewById(R.id.c43);
        c44=(CheckBox)findViewById(R.id.c44);
        c45=(CheckBox)findViewById(R.id.c45);
        c46=(CheckBox)findViewById(R.id.c46);
        c47=(CheckBox)findViewById(R.id.c47);

        c51=(CheckBox)findViewById(R.id.c51);
        c52=(CheckBox)findViewById(R.id.c52);
        c53=(CheckBox)findViewById(R.id.c53);
        c54=(CheckBox)findViewById(R.id.c54);
        c55=(CheckBox)findViewById(R.id.c55);
        c56=(CheckBox)findViewById(R.id.c56);
        c57=(CheckBox)findViewById(R.id.c57);

        c61=(CheckBox)findViewById(R.id.c61);
        c62=(CheckBox)findViewById(R.id.c62);
        c63=(CheckBox)findViewById(R.id.c63);
        c64=(CheckBox)findViewById(R.id.c64);
        c65=(CheckBox)findViewById(R.id.c65);
        c66=(CheckBox)findViewById(R.id.c66);
        c67=(CheckBox)findViewById(R.id.c67);

        c71=(CheckBox)findViewById(R.id.c71);
        c72=(CheckBox)findViewById(R.id.c72);
        c73=(CheckBox)findViewById(R.id.c73);
        c74=(CheckBox)findViewById(R.id.c74);
        c75=(CheckBox)findViewById(R.id.c75);
        c76=(CheckBox)findViewById(R.id.c76);
        c77=(CheckBox)findViewById(R.id.c77);
        //Le asignamos colores a los background del checkbox

        textTest=(TextView)findViewById(R.id.textTest);

        Button btnComp=(Button)findViewById(R.id.btnComp7);
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
                if(c16.isChecked()){if(!lista.equals("1,6"))lista.add("1,6");}
                if(c17.isChecked()){if(!lista.equals("1,7"))lista.add("1,7");}

                if(c21.isChecked()){if(!lista.equals("2,1"))lista.add("2,1");}
                if(c22.isChecked()){if(!lista.equals("2,2"))lista.add("2,2");}
                if(c23.isChecked()){if(!lista.equals("2,3"))lista.add("2,3");}
                if(c24.isChecked()){if(!lista.equals("2,4"))lista.add("2,4");}
                if(c25.isChecked()){if(!lista.equals("2,5"))lista.add("2,5");}
                if(c26.isChecked()){if(!lista.equals("2,6"))lista.add("2,6");}
                if(c27.isChecked()){if(!lista.equals("2,7"))lista.add("2,7");}

                if(c31.isChecked()){if(!lista.equals("3,1"))lista.add("3,1");}
                if(c32.isChecked()){if(!lista.equals("3,2"))lista.add("3,2");}
                if(c33.isChecked()){if(!lista.equals("3,3"))lista.add("3,3");}
                if(c34.isChecked()){if(!lista.equals("3,4"))lista.add("3,4");}
                if(c35.isChecked()){if(!lista.equals("3,5"))lista.add("3,5");}
                if(c36.isChecked()){if(!lista.equals("3,6"))lista.add("3,6");}
                if(c37.isChecked()){if(!lista.equals("3,7"))lista.add("3,7");}

                if(c41.isChecked()){if(!lista.equals("4,1"))lista.add("4,1");}
                if(c42.isChecked()){if(!lista.equals("4,2"))lista.add("4,2");}
                if(c43.isChecked()){if(!lista.equals("4,3"))lista.add("4,3");}
                if(c44.isChecked()){if(!lista.equals("4,4"))lista.add("4,4");}
                if(c45.isChecked()){if(!lista.equals("4,5"))lista.add("4,5");}
                if(c46.isChecked()){if(!lista.equals("4,6"))lista.add("4,6");}
                if(c47.isChecked()){if(!lista.equals("4,7"))lista.add("4,7");}

                if(c51.isChecked()){if(!lista.equals("5,1"))lista.add("5,1");}
                if(c52.isChecked()){if(!lista.equals("5,2"))lista.add("5,2");}
                if(c53.isChecked()){if(!lista.equals("5,3"))lista.add("5,3");}
                if(c54.isChecked()){if(!lista.equals("5,4"))lista.add("5,4");}
                if(c55.isChecked()){if(!lista.equals("5,5"))lista.add("5,5");}
                if(c56.isChecked()){if(!lista.equals("5,6"))lista.add("5,6");}
                if(c57.isChecked()){if(!lista.equals("5,7"))lista.add("5,7");}

                if(c61.isChecked()){if(!lista.equals("6,1"))lista.add("6,1");}
                if(c62.isChecked()){if(!lista.equals("6,2"))lista.add("6,2");}
                if(c63.isChecked()){if(!lista.equals("6,3"))lista.add("6,3");}
                if(c64.isChecked()){if(!lista.equals("6,4"))lista.add("6,4");}
                if(c65.isChecked()){if(!lista.equals("6,5"))lista.add("6,5");}
                if(c66.isChecked()){if(!lista.equals("6,6"))lista.add("6,6");}
                if(c67.isChecked()){if(!lista.equals("6,7"))lista.add("6,7");}

                if(c71.isChecked()){if(!lista.equals("7,1"))lista.add("7,1");}
                if(c72.isChecked()){if(!lista.equals("7,2"))lista.add("7,2");}
                if(c73.isChecked()){if(!lista.equals("7,3"))lista.add("7,3");}
                if(c74.isChecked()){if(!lista.equals("7,4"))lista.add("7,4");}
                if(c75.isChecked()){if(!lista.equals("7,5"))lista.add("7,5");}
                if(c76.isChecked()){if(!lista.equals("7,6"))lista.add("7,6");}
                if(c77.isChecked()){if(!lista.equals("7,7"))lista.add("7,7");}

                //soluciones
                int N=7;
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
                
                System.out.println("======================================");
                System.out.println("listaLocal: "+lista);
                for(int i=0;i<soluciones.size();i++)
                System.out.println("arr"+i+":"+ Arrays.toString(lista_reinas.get(i)));
                /*
                //soluciones para pruebas
                [1,1, 2,3, 3,5, 4,7, 5,2, 6,4, 7,6]
                [1,1, 2,4, 3,7, 4,3, 5,6, 6,2, 7,5]
                [1,1, 2,5, 3,2, 4,6, 5,3, 6,7, 7,4]
                [1,1, 2,6, 3,4, 4,2, 5,7, 6,5, 7,3]
                [1,2, 2,4, 3,1, 4,7, 5,5, 6,3, 7,6]
                [1,2, 2,4, 3,6, 4,1, 5,3, 6,5, 7,7]
                [1,2, 2,5, 3,1, 4,4, 5,7, 6,3, 7,6]
                [1,2, 2,5, 3,3, 4,1, 5,7, 6,4, 7,6]
                [1,2, 2,5, 3,7, 4,4, 5,1, 6,3, 7,6]
                [1,2, 2,6, 3,3, 4,7, 5,4, 6,1, 7,5]
                [1,2, 2,7, 3,5, 4,3, 5,1, 6,6, 7,4]
                [1,3, 2,1, 3,6, 4,2, 5,5, 6,7, 7,4]
                [1,3, 2,1, 3,6, 4,4, 5,2, 6,7, 7,5]
                [1,3, 2,5, 3,7, 4,2, 5,4, 6,6, 7,1]
                [1,3, 2,6, 3,2, 4,5, 5,1, 6,4, 7,7]
                [1,3, 2,7, 3,2, 4,4, 5,6, 6,1, 7,5]
                [1,3, 2,7, 3,4, 4,1, 5,5, 6,2, 7,6]
                [1,4, 2,1, 3,3, 4,6, 5,2, 6,7, 7,5]
                [1,4, 2,1, 3,5, 4,2, 5,6, 6,3, 7,7]
                [1,4, 2,2, 3,7, 4,5, 5,3, 6,1, 7,6]
                [1,4, 2,6, 3,1, 4,3, 5,5, 6,7, 7,2]
                [1,4, 2,7, 3,3, 4,6, 5,2, 6,5, 7,1]
                [1,4, 2,7, 3,5, 4,2, 5,6, 6,1, 7,3]
                [1,5, 2,1, 3,4, 4,7, 5,3, 6,6, 7,2]
                [1,5, 2,1, 3,6, 4,4, 5,2, 6,7, 7,3]
                [1,5, 2,2, 3,6, 4,3, 5,7, 6,4, 7,1]
                [1,5, 2,3, 3,1, 4,6, 5,4, 6,2, 7,7]
                [1,5, 2,7, 3,2, 4,4, 5,6, 6,1, 7,3]
                [1,5, 2,7, 3,2, 4,6, 5,3, 6,1, 7,4]
                [1,6, 2,1, 3,3, 4,5, 5,7, 6,2, 7,4]
                [1,6, 2,2, 3,5, 4,1, 5,4, 6,7, 7,3]
                [1,6, 2,3, 3,1, 4,4, 5,7, 6,5, 7,2]
                [1,6, 2,3, 3,5, 4,7, 5,1, 6,4, 7,2]
                [1,6, 2,3, 3,7, 4,4, 5,1, 6,5, 7,2]
                [1,6, 2,4, 3,2, 4,7, 5,5, 6,3, 7,1]
                [1,6, 2,4, 3,7, 4,1, 5,3, 6,5, 7,2]
                [1,7, 2,2, 3,4, 4,6, 5,1, 6,3, 7,5]
                [1,7, 2,3, 3,6, 4,2, 5,5, 6,1, 7,4]
                [1,7, 2,4, 3,1, 4,5, 5,2, 6,6, 7,3]
                [1,7, 2,5, 3,3, 4,1, 5,6, 6,4, 7,2]
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
                if(ganaste){textTest.setText("Ganaste");}else{textTest.setText("L");}

            }
        });


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

        c21.setBackgroundResource(R.drawable.rojo);
        c22.setBackgroundResource(R.drawable.negro);
        c23.setBackgroundResource(R.drawable.rojo);
        c24.setBackgroundResource(R.drawable.negro);
        c25.setBackgroundResource(R.drawable.rojo);
        c26.setBackgroundResource(R.drawable.negro);
        c27.setBackgroundResource(R.drawable.rojo);

        c31.setBackgroundResource(R.drawable.negro);
        c32.setBackgroundResource(R.drawable.rojo);
        c33.setBackgroundResource(R.drawable.negro);
        c34.setBackgroundResource(R.drawable.rojo);
        c35.setBackgroundResource(R.drawable.negro);
        c36.setBackgroundResource(R.drawable.rojo);
        c37.setBackgroundResource(R.drawable.negro);

        c41.setBackgroundResource(R.drawable.rojo);
        c42.setBackgroundResource(R.drawable.negro);
        c43.setBackgroundResource(R.drawable.rojo);
        c44.setBackgroundResource(R.drawable.negro);
        c45.setBackgroundResource(R.drawable.rojo);
        c46.setBackgroundResource(R.drawable.negro);
        c47.setBackgroundResource(R.drawable.rojo);

        c51.setBackgroundResource(R.drawable.negro);
        c52.setBackgroundResource(R.drawable.rojo);
        c53.setBackgroundResource(R.drawable.negro);
        c54.setBackgroundResource(R.drawable.rojo);
        c55.setBackgroundResource(R.drawable.negro);
        c56.setBackgroundResource(R.drawable.rojo);
        c57.setBackgroundResource(R.drawable.negro);

        c61.setBackgroundResource(R.drawable.rojo);
        c62.setBackgroundResource(R.drawable.negro);
        c63.setBackgroundResource(R.drawable.rojo);
        c64.setBackgroundResource(R.drawable.negro);
        c65.setBackgroundResource(R.drawable.rojo);
        c66.setBackgroundResource(R.drawable.negro);
        c67.setBackgroundResource(R.drawable.rojo);

        c71.setBackgroundResource(R.drawable.negro);
        c72.setBackgroundResource(R.drawable.rojo);
        c73.setBackgroundResource(R.drawable.negro);
        c74.setBackgroundResource(R.drawable.rojo);
        c75.setBackgroundResource(R.drawable.negro);
        c76.setBackgroundResource(R.drawable.rojo);
        c77.setBackgroundResource(R.drawable.negro);

    }
}

