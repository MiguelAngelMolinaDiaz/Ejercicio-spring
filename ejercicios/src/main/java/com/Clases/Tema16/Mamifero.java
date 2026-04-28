package com.Clases.Tema16;

public class Mamifero extends Animal{
    @Override
    public void nacer() {
        System.out.println("Mamifero naciendo...");
    }

    public final void amamantar(){
        System.out.println("Mamifero amamantando...");
    }
}
