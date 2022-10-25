package Tarea7;

import java.util.ArrayList;

public class Aviones {
    private ArrayList<Vuelos> vuelos;

    //Constructor
    public Aviones(ArrayList<Vuelos> vuelos) {
        setVuelos(vuelos);
    }

    //Getter
    public ArrayList<Vuelos> getVuelos() {
        return vuelos;
    }

    //Setter
    private void setVuelos(ArrayList<Vuelos> vuelos) {
        this.vuelos = vuelos;
    }

    //Encontrar usuarios en una fecha determinada
    public ArrayList<Pasajeros> encontrarUsuariosSegunFechaVuelo(Fechas fechaDeVuelo) {
        int posicion = -1;
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getFechaSalida() == fechaDeVuelo){
                posicion = i;
            }
        }
        if (posicion != -1) {
            return vuelos.get(posicion).getPasajeros();
        } else {
            return null;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Aviones{" +
                "Vuelos: " + vuelos + '}';
    }
}
