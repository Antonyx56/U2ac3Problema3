import java.util.ArrayList;
public class Vehiculo {
    private String marca;
    private String modelo;
    private double cargaMaxima;
    private String fechaAdquisicion;

    private ArrayList<Viaje> viajes;

    public Vehiculo(String marca, String modelo, double cargaMaxima, String fechaAdquisicion, ArrayList<Viaje> viajes) {
        this.marca = marca;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.fechaAdquisicion = fechaAdquisicion;
        this.viajes = viajes;
    }
    public void agregarViaje(Viaje v){
        viajes.add(v);
    }

    public void cancelarViaje(Viaje v){
        viajes.remove(v);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", fechaAdquisicion='" + fechaAdquisicion + '\'' +
                '}';
    }
}
