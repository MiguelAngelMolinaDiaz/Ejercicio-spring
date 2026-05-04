package EjercicioActividad5;

public class Ejercicio05 {
    
    public Ejercicio05() {}

    public static void main(String[] args) {
        
        Reina reina = new Reina();
        Macho macho = new Macho();
        
        Ejercicio05 ej = new Ejercicio05();
        
        ej.funcionesObrero(macho);
        ej.funcionesExplorador(macho);
        ej.funcionesSoldado(macho);
    }

    private void funcionesObrero(Obrero obrero) {
        obrero.recolectar();
        obrero.excavar();
    }

    private void funcionesExplorador(Explorador explorador) {
        explorador.investigar();
    }

    private void funcionesSoldado(Soldado soldado) {
        soldado.luchar();
    }
}