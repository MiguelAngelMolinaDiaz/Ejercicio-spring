package EjercicioActividad2;

public abstract class Anfibio extends Animal {
    public void comer() {}
    public void desplazarse() {}
    public void reproducirse() {}
    public void nacer() {}
}
// Especies
class Sapo extends Anfibio {}
class SapoMacho extends Sapo {}
class SapoHembra extends Sapo { public void criar() {} }

class Salamandra extends Anfibio {}
class SalamandraMacho extends Salamandra {}
class SalamandraHembra extends Salamandra { public void criar() {} }
