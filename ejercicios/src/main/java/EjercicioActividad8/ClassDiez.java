package EjercicioActividad8;

public class ClassDiez implements InterfaceDiez {
    
    public ClassDiez() {
    }
    
    @Override
    public ClassDiez getClassDiez() {
        return new ClassDiez();
    }
}
