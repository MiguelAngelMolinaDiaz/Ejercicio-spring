package EjercicioActividad4;

public class App {
    public App() {}

    public static void main(String[] args) {
        // App crea el S7 y el Iphone6
        GalaxyS7 s7 = new GalaxyS7();
        Iphone6 i6 = new Iphone6();
        
        // También llama a los métodos de la base
        s7.encender();
        i6.encender();
    }
}
