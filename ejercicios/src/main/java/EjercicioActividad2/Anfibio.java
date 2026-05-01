package EjercicioActividad2;

public class Anfibio extends Animal {
    public void comer() {}
    public void desplazarse() {}
    public void reproducirse() {}
    public void nacer() {}
}

// Subclases: Sapo y Salamandra
class Sapo extends Anfibio { }
class SapoMacho extends Sapo { }
class SapoHembra extends Sapo { public void criar() {} }

class Salamandra extends Anfibio { }
class SalamandraMacho extends Salamandra { }
class SalamandraHembra extends Salamandra { public void criar() {} }
