package EjercicioActividad1;

public class App {
    public static void main(String[] args) {
        Avion avion = new Avion();
        Gafas gafas = new Gafas();
        Pan pan = new Pan();
        Tamal tamal = new Tamal();
        Persona persona = new Persona();
        Arbol arbol = new Arbol();

        avion.setMarca("Boeing");
        avion.setPrecio(1500000.0f);
        avion.setCapacidad(150);
        avion.setTurbinas(2);
        avion.setColor("Blanco");

        gafas.setMarca("Ray-Ban");
        gafas.setColor("Negro");
        gafas.setPrecio(120.0f);
        gafas.setGrosor(2.5f);
        gafas.setEstilo("Aviador");

        pan.setTipo("Integral");
        pan.setPrecio(2500.0f);
        pan.setPeso(0.5f);
        pan.setColor("Cafe");
        pan.setSabor("Dulce");

        tamal.setRegion("Tolima");
        tamal.setPrecio(5000.0f);
        tamal.setTamanio("Grande");
        tamal.setPeso(0.8f);
        tamal.setColor("Verde");

        persona.setColorOjos("Cafes");
        persona.setDedos(10);
        persona.setColorPiel("Trigueña");
        persona.setColorCabello("Negro");
        persona.setLunares(5);

        arbol.setTipo("Pino");
        arbol.setAltura(6.5f);
        arbol.setEdad(15);
        arbol.setDiametro(1.2f);
        arbol.setColor("Verde Oscuro");

        System.out.println("Proyecto listo para ingeniería inversa.");
    }
}