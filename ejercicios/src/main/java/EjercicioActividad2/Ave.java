package EjercicioActividad2;

public abstract class Ave extends Animal {
    public void desplazarse() {}
    public void reproducirse() {}
    public void nacer() {}
}
// Especies
class Avestruz extends Ave { 
    public void comer() {} 
    public void desplazarse() {} 
}
class AvestruzMacho extends Avestruz {}
class AvestruzHembra extends Avestruz { public void criar() {} }

class Aguila extends Ave { public void comer() {} }
class AguilaMacho extends Aguila {}
class AguilaHembra extends Aguila { public void criar() {} }
