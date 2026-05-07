package EjercicioActividad8;

public class ClassNueve implements InterfaceNueve {
    
    public ClassNueve() {
    }
    
    @Override
    public ClassDiez getClassDiez() {
        return new ClassDiez();
    }
}
