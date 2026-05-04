package EjercicioActividad4;

public class App2 {
    public App2() {}

    public static void main(String[] args) {
        // App2 crea el S6 y el Iphone7
        GalaxyS6 s6 = new GalaxyS6();
        Iphone7 i7 = new Iphone7();
        
        s6.tomarFotos();
        i7.tomarFotos();
    }
}
