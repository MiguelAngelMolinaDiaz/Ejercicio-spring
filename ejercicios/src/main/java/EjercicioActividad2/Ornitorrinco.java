package EjercicioActividad2;

public class Ornitorrinco extends Mamifero {
    @Override
    public void desplazarse() {}
    @Override
    public void nacer() {}
    @Override
    public void reproducirse() {}
}

// Clases hijas de Ornitorrinco
class OrnitorrincoMacho extends Ornitorrinco { }
class OrnitorrincoHembra extends Ornitorrinco { public void criar() {} }
