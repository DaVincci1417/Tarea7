package Tarea7;

public class Ciudad {
    private String ciudad;
    private String pais;

    //Constructor
    public Ciudad(String ciudad, String pais){
        setCiudad(ciudad);
        setPais(pais);
    }

    //Setters
    private void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    private void setPais(String pais) {
        this.pais = pais;
    }

    //toString
    @Override
    public String toString() {
        return "Ciudad{ " +
                "Ciudad: " + ciudad + "\n" +
                "Pais: " + pais + " }";
    }
}
