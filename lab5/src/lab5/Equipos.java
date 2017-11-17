package lab5;

import java.util.ArrayList;

public class Equipos {

    private String nombre_deEquipo;
    private int copas;
    private double presupuesto;
    private ArrayList<Jugador> jugadores = new ArrayList();
    private String Estadio;

    public Equipos() {
    }

    public Equipos(String nombre_deEquipo, int copas, double presupuesto, String Estadio) {
        this.nombre_deEquipo = nombre_deEquipo;
        this.copas = copas;
        this.presupuesto = presupuesto;
        this.Estadio = Estadio;
    }

    public String getNombre_deEquipo() {
        return nombre_deEquipo;
    }

    public void setNombre_deEquipo(String nombre_deEquipo) {
        this.nombre_deEquipo = nombre_deEquipo;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador j) {
        jugadores.add(j);
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    @Override
    public String toString() {
        return   nombre_deEquipo + " "+ Estadio;
    }
    
}
