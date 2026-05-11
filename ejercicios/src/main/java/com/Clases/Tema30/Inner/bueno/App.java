package com.Clases.Tema30.Inner.bueno;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Clase01 clase01 = new Clase01();
        IntefaceClase02 clase02 = clase01.creadorClase02();
        IntefaceClase03 clase03 = clase02.creadorClase03();



    }
}