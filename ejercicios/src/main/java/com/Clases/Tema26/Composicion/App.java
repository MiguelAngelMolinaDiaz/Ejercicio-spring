package com.Clases.Tema26.Composicion;

public class App {
    public static void main(String[] args) {
        Caballo caballo = new Caballo();

        for (Pata pata: caballo.getPataList()) {
            System.out.println(pata);
        }

        System.out.println(caballo.getCerebro());

        System.out.println(caballo.getMontura());
        Caballo.getMontura().AjustarCorrea();
    }
}
