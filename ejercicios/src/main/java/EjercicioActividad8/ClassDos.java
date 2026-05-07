package EjercicioActividad8;

public class ClassDos implements InterfaceDos {
    
    public ClassDos() {
    }
    
    @Override
    public ClassTres getClassTres() {
        return new ClassTres();
    }
}
