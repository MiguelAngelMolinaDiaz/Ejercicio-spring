package EjercicioActividad2;

public class Perro extends Mamifero {
    private int patas = 4;
    private String raza;

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    @Override
    public void desplazarse() {}
}

// Clases hijas de Perro
class PerroMacho extends Perro { }
class PerroHembra extends Perro { public void criar() {} }
