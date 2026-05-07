package EjercicioActividad8;

public class ClassCinco implements InterfaceCinco {
    
    public ClassCinco() {
    }
    
    @Override
    public ClassSeis getClassSeis() {
        return new ClassSeis();
    }
}
