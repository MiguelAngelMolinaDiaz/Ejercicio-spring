package EjercicioActividad;

public class Tamal {
    private String color;
    private String tamano; // se cambia 'tamaño' por 'tamano'
    private String region;
    private float precio;
    private float peso;

    // Constructor vacío
    public Tamal() {
    }

    // Getter y Setter de color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter y Setter de tamano
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    // Getter y Setter de region
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Getter y Setter de precio
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Getter y Setter de peso
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}