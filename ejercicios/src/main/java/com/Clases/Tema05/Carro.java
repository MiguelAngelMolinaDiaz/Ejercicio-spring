package com.Clases.Tema05;

public class Carro {
    public void prende() {
        System.out.println("El carro se ha encendido");
    }

    public String pitar() {
        return "Piiiiiiiii";
    }

    public void acelerar(int fuerzaPedal) { //fuerzaPedal es un parametro 
        System.out.println("El carro esta acelerando con una fuerza de: " + fuerzaPedal);
    }

}
