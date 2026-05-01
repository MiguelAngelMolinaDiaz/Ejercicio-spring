package EjercicioActividad2;

public class Pez extends Animal {
    public void desplazarse() {}
    public void reproducirse() {}
    public void nacer() {}
}

// Subclases: Atún y Tiburón
class Atun extends Pez { public void comer() {} }
class AtunMacho extends Atun { }
class AtunHembra extends Atun { public void criar() {} }

class Tiburon extends Pez { 
    public void comer() {} 
    public void nacer() {} 
}
class TiburonMacho extends Tiburon { }
class TiburonHembra extends Tiburon { public void criar() {} }