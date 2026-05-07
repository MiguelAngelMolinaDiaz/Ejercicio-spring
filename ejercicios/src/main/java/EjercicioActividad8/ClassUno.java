package EjercicioActividad8;

public class ClassUno implements InterfaceUno {
    
    public ClassUno() {
    }
    
    @Override
    public ClassDos getClassDos() {
        return new ClassDos();
    }
}
