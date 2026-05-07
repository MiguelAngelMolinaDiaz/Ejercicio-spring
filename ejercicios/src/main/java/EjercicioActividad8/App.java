package EjercicioActividad8;

public class App {
    
    public static void main(String[] args) {
        ClassUno claseUno = new ClassUno();
        ClassDos claseDos = claseUno.getClassDos();
        ClassTres claseTres = claseDos.getClassTres();
        ClassCuatro claseCuatro = claseTres.getClassCuatro();
        ClassCinco claseCinco = claseCuatro.getClassCinco();
        ClassSeis claseSeis = claseCinco.getClassSeis();
        ClassSiete claseSiete = claseSeis.getClassSiete();
        ClassOcho claseOcho = claseSiete.getClassOcho();
        ClassNueve claseNueve = claseOcho.getClassNueve();
        ClassDiez claseDiez = claseNueve.getClassDiez();
        
        System.out.println("Estructura de ejercicio 8 creada exitosamente");
    }
}
