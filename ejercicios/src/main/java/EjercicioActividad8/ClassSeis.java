package EjercicioActividad8;

public class ClassSeis implements InterfaceSeis {
    
    public ClassSeis() {
    }
    
    @Override
    public ClassSiete getClassSiete() {
        return new ClassSiete();
    }
}
