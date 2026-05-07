package EjercicioActividad8;

public class ClassCuatro implements InterfaceCuatro {
    
    public ClassCuatro() {
    }
    
    @Override
    public ClassCinco getClassCinco() {
        return new ClassCinco();
    }
}
