package EjercicioActividad2;

public abstract class Reptil extends Animal {
    public void desplazarse() {}
    public void reproducirse() {}
    public void nacer() {}
}
// Especies
class Tortuga extends Reptil { public void comer() {} }
class TortugaMacho extends Tortuga {}
class TortugaHembra extends Tortuga { public void criar() {} }

class Cocodrilo extends Reptil { public void comer() {} }
class CocodriloMacho extends Cocodrilo {}
class CocodriloHembra extends Cocodrilo { public void criar() {} }
