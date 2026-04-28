package com.Clases.Tema01;

public class App {

    public static void main(String[] args) {
        Llave llave = new Llave(); //objeto que es la instancia de una clase 
        System.out.println(llave);
        // no se puede instanciar porque es abstracto
        //Vehiculo vehiculo = new Vehiculo


        String textoInicial = "Hola mundo";
        String textoFinal = textoInicial.toUpperCase();
        System.out.println(textoFinal);
    }

}