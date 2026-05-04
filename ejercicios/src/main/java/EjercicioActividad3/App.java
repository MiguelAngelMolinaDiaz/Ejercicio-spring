package EjercicioActividad3;

public class App {
    public App() {}

    public static void main(String[] args) {
        // Nintendo
        WiiU wiiu = new WiiU(2, "HDMI", "Digital");
        Snes snes = new Snes(2, "RCA", "Analogo");
        Wii wii = new Wii(4, "Componente", "Analogo");
        Switch sw = new Switch(2, "HDMI", "Digital");

        // PsVita
        PsvitaFat pvf = new PsvitaFat(1, "Propio", "Jack");
        PsvitaSlim pvs = new PsvitaSlim(1, "Micro USB", "Jack");

        // Play2
        Play2Fat p2f = new Play2Fat(2, "RCA", "Optico");
        Play2Slim p2s = new Play2Slim(2, "RCA", "Optico");

        // Familia PlayStation
        Play3Fat p3f = new Play3Fat(2, "HDMI", "Optico");
        Play3Slim p3s = new Play3Slim(2, "HDMI", "Optico");
        Play1Fat p1f = new Play1Fat(2, "RCA", "Analogo");
        Play1Slim p1s = new Play1Slim(2, "RCA", "Analogo");
        Play4Pro p4p = new Play4Pro(2, "HDMI", "Optico");
        Play4Fat p4f = new Play4Fat(2, "HDMI", "Optico");
        Play4Slim p4s = new Play4Slim(2, "HDMI", "Optico");

        System.out.println("Sistema de Consolas Cargado Correctamente.");
    }
}