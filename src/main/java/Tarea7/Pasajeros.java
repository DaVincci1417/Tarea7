package Tarea7;

import java.util.ArrayList;

public class Pasajeros {
    private ArrayList<Personas> pasajero;
    private Fechas fechaSalida;
    private PasaporteSanitario pasaporteSanitario;
    private Fechas fechaLlegada;

    public Pasajeros(ArrayList<Personas> pasajeros, Fechas fechaSalida, PasaporteSanitario pasaporteSanitario, Fechas fechaDeVuelo) {
        setPasajero(pasajeros);
        setFechaSalida(fechaSalida);
        setPasaporteSanitario(pasaporteSanitario);
        setFechaDeVuelo(fechaDeVuelo);
    }

    //Setters
    public void setPasajero(ArrayList<Personas> pasajero) {
        this.pasajero = pasajero;
    }
    public void setFechaSalida(Fechas fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    private void setPasaporteSanitario(PasaporteSanitario pasaporteSanitario){
        this.pasaporteSanitario = pasaporteSanitario;
    }
    private void setFechaDeVuelo(Fechas fechaLlegada){
        this.fechaLlegada = fechaLlegada;
    }

    //Getters
    public PasaporteSanitario getPasaporteSanitario() {
        return pasaporteSanitario;
    }
    public ArrayList<Personas> getPasajero() {
        return pasajero;
    }
    public Fechas getFechaSalida() {
        return fechaSalida;
    }
    public Fechas getFechaDeVuelo() {
        return fechaLlegada;
    }

    //Agregar, eliminar y encontrar pasajeros
    public Personas eliminarPasajero(String rut){
        Personas pasajeroEliminado = encontrarPasajero(rut);
        pasajero.remove(pasajeroEliminado);
        return pasajeroEliminado;
    }
    public Personas encontrarPasajero(String rut) {
        int posicion = -1;
        for (int i = 0; i < pasajero.size(); i++) {
            if (pasajero.get(i).getRut() == rut) {
                posicion = i;
            }
        }
        if (posicion != -1) {
            return pasajero.get(posicion);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Pasajeros{" +
                "Pasajero: " + pasajero + "\n"+
                "Fecha Salida: " + fechaSalida + "}";
    }
}
