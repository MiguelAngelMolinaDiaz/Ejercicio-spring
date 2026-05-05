package com.Clases.Tema26.Composicion;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Caballo caballo = new Caballo();


        for (Pata pata: caballo.getPataList()){
            System.out.println(pata);
        }

        System.out.println(caballo.getCerebro());

        System.out.println(caballo.getMontura());
        if(caballo.getMontura() == null){
            System.out.println("El caballo no tiene montura");
        }else {
            caballo.getMontura().ajutarCorrea();
        }
    }
