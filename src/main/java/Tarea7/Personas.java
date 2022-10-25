package Tarea7;

public class Personas {
    private String nombreCompleto;
    private String rut;

    //Generador para Pasajeros
    public Personas(String nombreCompleto, String rut, PasaporteSanitario pasaporteSanitario) {
        setNombreCompleto(nombreCompleto);
        setRut(rut);
    }
    //Generador para Pilotos
    public Personas(String nombreCompleto, String rut){
        setNombreCompleto(nombreCompleto);
        setRut(rut);
    }

    //Setters
    private void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    private void setRut(String rut){
        try {
            validarRut(rut);
            this.rut = rut;
        }catch (Exception e){
            System.out.println("Ha ocurrido un error, ingrese el RUT de nuevo.");
        }

    }


    //Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getRut() {
        return rut;
    }


    //Validacion de RUT
    private void validarRut(String rut) throws Exception{
        String rutSinPuntosNiGuion = quitarPuntosYGuion(rut);
        String mensajeError = "Ingrese un RUT valido.";

        if (rutSinPuntosNiGuion.length() > 9){
            throw new Exception(mensajeError);
        }

        if(!rutSinPuntosNiGuion.substring(8,9).equalsIgnoreCase("k")){
            try {
                Integer.parseInt(rut.substring(8,9));
            }catch (Exception e){
                throw new Exception(mensajeError);
            }
        }

        try {
            Integer.parseInt(rutSinPuntosNiGuion.substring(0,8));
        }catch (Exception e){
            throw new Exception(mensajeError);
        }
    }
    private String quitarPuntosYGuion(String rut){
        String rutSinPuntos;
        rutSinPuntos = rut.replace(".", "");
        String rutSinPuntosNiGuion = rutSinPuntos.replace("-", "");
        String rutLimpio = rutSinPuntosNiGuion.replace(" ", "");
        return rutLimpio;
    }

    //toString
    @Override
    public String toString() {
        return "Personas{" +
                "Nombre: " + nombreCompleto + "\n" +
                "RUT: " + rut + "}";
    }
}
