package Tarea7;

import java.util.ArrayList;

public class Pilotos {
    private ArrayList<Personas> pilotos;

    public Pilotos(ArrayList<Personas> pilotos) {
        setPilotos(pilotos);
    }

    //Constructor
    public void setPilotos(ArrayList<Personas> pasajero) {
        this.pilotos = pasajero;
    }

    //Agregar, eliminar y encontrar pilotos
    public void agregarPiloto(Personas pasajero){
        pilotos.add(pasajero);
    }
    public Personas eliminarPiloto(String rut){
        Personas pilotoEliminado = encontrarPiloto(rut);
        pilotos.remove(pilotoEliminado);
        return pilotoEliminado;
    }
    public Personas encontrarPiloto(String rut) {
        int posicion = -1;
        for (int i = 0; i < pilotos.size(); i++) {
            if (pilotos.get(i).getRut() == rut) {
                posicion = i;
            }
        }
        if (posicion != -1) {
            return pilotos.get(posicion);
        } else {
            return null;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Pilotos{" +
                "Pilotos:" + pilotos + '}';
    }
}
