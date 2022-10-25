package Tarea7;

public class Fechas {
    private String dia;
    private String mes;
    private String año;

    public Fechas(String dia, String mes, String año) {
        setDia(dia);
        setMes(mes);
        setAño(año);
    }

    //Setters
    private void setDia(String dia){
        validacion(dia);
        this.dia = dia;
    }
    private void setMes(String mes) {
        validacion(mes);
        this.mes = mes;
    }
    private void setAño(String año) {
        validacion(año);
        this.año = año;
    }

    //Getters
    public String getDia() {
        return dia;
    }
    public String getMes() {
        return mes;
    }
    public String getAño() {
        return año;
    }

    //Validacion
    private void validacion(String numero){
        try {
            Integer.parseInt(numero);
        }catch (Exception e){
            System.out.println("Ingrese una fecha valida");
        }

    }

    //toString
    @Override
    public String toString() {
        return "Fechas{ " +
                "Dia: " + dia + '\n' +
                "Mes: " + mes + '\n' +
                "Año: " + año  + " }";
    }
}
