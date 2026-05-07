package EjercicioActividad8;

public class ClassOcho implements InterfaceOcho {
    
    public ClassOcho() {
    }
    
    @Override
    public ClassNueve getClassNueve() {
        return new ClassNueve();
    }
}
