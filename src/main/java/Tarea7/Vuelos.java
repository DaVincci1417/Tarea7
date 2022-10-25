package Tarea7;

import java.util.ArrayList;

public class Vuelos {
    private Ciudad ciudadOrigen;
    private Fechas fechaSalida;
    private Ciudad ciudadDestino;
    private Fechas fechaLlegada;

    private ArrayList<Pasajeros> pasajeros;

    private ArrayList<Pilotos> pilotos;

    //Constructor
    public Vuelos(Ciudad ciudadOrigen, Fechas fechaSalida, Ciudad ciudadDestino, Fechas fechaLlegada) {
       setCiudadOrigen(ciudadOrigen);
       setCiudadDestino(ciudadDestino);
       setFechaSalida(fechaSalida);
       setFechaLlegada(fechaLlegada);
    }

    //Setters
    private void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    private void setFechaSalida(Fechas fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    private void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    private void setFechaLlegada(Fechas fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    //Getters
    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public Fechas getFechaSalida() {
        return fechaSalida;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public Fechas getFechaLlegada() {
        return fechaLlegada;
    }

    public ArrayList<Pasajeros> getPasajeros() {
        return pasajeros;
    }

    public ArrayList<Pilotos> getPilotos() {
        return pilotos;
    }

    public Pasajeros encontrarPasajero(Fechas fechaDeVuelo) {
        int posicion = -1;
        for (int i = 0; i < pasajeros.size(); i++) {
            if (pasajeros.get(i).getFechaSalida() == fechaDeVuelo){
                posicion = i;
            }
        }
        if (posicion != -1) {
            return pasajeros.get(posicion);
        } else {
            return null;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Vuelos{" +
                "Ciudad Origen:" + ciudadOrigen + "\n"+
                "Fecha Salida=" + fechaSalida + "\n"+
                "Ciudad Destino=" + ciudadDestino + "\n"+
                "Fecha Llegada=" + fechaLlegada + "\n"+
                "Pasajeros=" + pasajeros + "\n"+
                "Pilotos=" + pilotos + '}';
    }
}
