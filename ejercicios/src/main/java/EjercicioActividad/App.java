package EjercicioActividad;

public class App {
    public static void main(String[] args) {

        // Instanciación de objetos (<<instantiate>>)
        Avion avion = new Avion();
        Gafas gafas = new Gafas();
        Pan pan = new Pan();
        Tamal tamal = new Tamal();
        Persona persona = new Persona();
        Arbol arbol = new Arbol();

        // Asignación de valores según tus atributos reales
        avion.setColor("Blanco");
        avion.setAltura(10.5f);
        avion.setEdad(5);
        avion.setDiametro(3.2f);
        avion.setTipo("Comercial");

        gafas.setMarca("Ray-Ban");
        gafas.setColor("Negro");

        pan.setTipo("Integral");
        pan.setPrecio(2500.0f);

        tamal.setRegion("Tolima");
        tamal.setPrecio(5000.0f);

        persona.setColorOjos("Cafes");
        persona.setDedos(10);

        arbol.setTipo("Pino");
        arbol.setAltura(6.5f);

        // Salida por consola
        System.out.println("Objetos creados correctamente:");
        System.out.println("Avion tipo: " + avion.getTipo());
        System.out.println("Avion altura: " + avion.getAltura());
        System.out.println("Gafas marca: " + gafas.getMarca());
        System.out.println("Pan tipo: " + pan.getTipo());
        System.out.println("Tamal region: " + tamal.getRegion());
        System.out.println("Persona ojos: " + persona.getColorOjos());
        System.out.println("Arbol tipo: " + arbol.getTipo());
    }
}
