package com.Clases.Tema07;

public class Computador {
    private String marca;
    private String modelo;
    private int ram;

    // firma de este contructor es computador()
    public Computador(){
        // Constructor generico
    }

    /*
    *constructor parametros 
    *
    * @param marca
    * @param modelo
    * @param ram
     */
    //firma computador (String, String, int)
    public Computador(String marca, String modelo, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
    }

}
