public class Viaje {
    private String ciudadDestino;
    private String direccion;
    private String fechaViaje;
    private String fechaRegreso;
    private String descripcionCarga;
    private double monto;

    public Viaje(String ciudadDestino, String direccion, String fechaViaje, String fechaRegreso, String descripcionCarga, double monto) {
        this.ciudadDestino = ciudadDestino;
        this.direccion = direccion;
        this.fechaViaje = fechaViaje;
        this.fechaRegreso = fechaRegreso;
        this.descripcionCarga = descripcionCarga;
        this.monto = monto;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "ciudadDestino='" + ciudadDestino + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaViaje='" + fechaViaje + '\'' +
                ", fechaRegreso='" + fechaRegreso + '\'' +
                ", descripcionCarga='" + descripcionCarga + '\'' +
                ", monto=" + monto +
                '}';
    }
}
