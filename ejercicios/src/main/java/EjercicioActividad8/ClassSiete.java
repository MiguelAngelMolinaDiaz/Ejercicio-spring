package EjercicioActividad8;

public class ClassSiete implements InterfaceSiete {
    
    public ClassSiete() {
    }
    
    @Override
    public ClassOcho getClassOcho() {
        return new ClassOcho();
    }
}
