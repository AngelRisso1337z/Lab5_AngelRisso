package lab5;


public class Jugador {
    private String nombre;
    private double habilidad;
    private double tecnica;
    private double resistencia;
    private double precio;
    private boolean dispon;
    private String pocicion;

    public Jugador() {
    }

    public Jugador(String nombre, double habilidad, double tecnica, double resistencia, double precio, boolean dispon,String pocicion) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
        this.precio = precio;
        this.dispon = dispon;
        this.pocicion=pocicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(double habilidad) {
        this.habilidad = habilidad;
    }

    public double getTecnica() {
        return tecnica;
    }

    public void setTecnica(double tecnica) {
        this.tecnica = tecnica;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDispon() {
        return dispon;
    }

    public void setDispon(boolean dispon) {
        this.dispon = dispon;
    }

    public String getPocicion() {
        return pocicion;
    }

    public void setPocicion(String pocicion) {
        this.pocicion = pocicion;
    }

    @Override
    public String toString() {
        return  nombre + ", precio=" + precio + ", pocicion=" + pocicion ;
    }
    
}
