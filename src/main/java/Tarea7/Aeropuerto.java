package Tarea7;

import java.util.ArrayList;

public class Aeropuerto {
    private ArrayList<Aviones> aviones;

    public ArrayList<Pasajeros> usuariosQueTienenVueloEnUnaFecha(Fechas fecha){
        for(Aviones avion : aviones){
            for(Vuelos vuelo : avion.getVuelos()){
               if(vuelo.getFechaSalida().equals(fecha)){
                   return vuelo.getPasajeros();
               }
            }
        }
        return null;
    }

    public ArrayList<Pasajeros> usuariosDeUnMismoVuelo(Vuelos vuelo){
        for(Aviones avion : aviones){
            for(Vuelos vuelos : avion.getVuelos()){
                if(vuelos.equals(vuelo)){
                    return vuelo.getPasajeros();
                }
            }
        }
        return null;
    }

    public ArrayList<Pasajeros> vuelosConCasosCovid(){
        for(Aviones avion : aviones){
            for(Vuelos vuelo : avion.getVuelos()){
                for(Pasajeros pasajero : vuelo.getPasajeros()){
                    if(pasajero.getPasaporteSanitario().getResultadoTest() == true){
                        return vuelo.getPasajeros();
                    }
                }
            }
        }
        return null;
    }
}

