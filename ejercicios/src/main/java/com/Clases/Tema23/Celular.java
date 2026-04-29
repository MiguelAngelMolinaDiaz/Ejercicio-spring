package com.Clases.Tema23;

public class Celular {
    private String modelo;
    private String referencia;

    public Celular(String modelo, String referencia) {
        this.modelo = modelo;
        this.referencia = referencia;
    }

    public void llamar(){
        System.out.println("ring ring");
    }
}
