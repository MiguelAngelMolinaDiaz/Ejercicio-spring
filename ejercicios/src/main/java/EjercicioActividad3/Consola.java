package EjercicioActividad3;

public class Consola {
    private String conectorVideo;
    private String conectorSonido;
    private int controles;

    public Consola(int controles, String conectorVideo, String conectorSonido) {
        this.controles = controles;
        this.conectorVideo = conectorVideo;
        this.conectorSonido = conectorSonido;
    }

    public String getConectorSonido() { return conectorSonido; }
    public void setConectorSonido(String conectorSonido) { this.conectorSonido = conectorSonido; }
    public String getConectorVideo() { return conectorVideo; }
    public void setConectorVideo(String conectorVideo) { this.conectorVideo = conectorVideo; }
    public int getControles() { return controles; }
    public void setControles(int controles) { this.controles = controles; }
}