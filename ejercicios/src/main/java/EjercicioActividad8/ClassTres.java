package EjercicioActividad8;

public class ClassTres implements InterfaceTres {
    
    public ClassTres() {
    }
    
    @Override
    public ClassCuatro getClassCuatro() {
        return new ClassCuatro();
    }
}
