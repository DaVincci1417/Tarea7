package Tarea7;

public class PasaporteSanitario {
    private boolean resultadoTesst;
    private Fechas fechaDelTest;

    public PasaporteSanitario(boolean resultadoTesst, Fechas fechaDelTest) {
        setFechaDelTest(fechaDelTest);
        setResultadoTesst(resultadoTesst);
    }

    private void setResultadoTesst(boolean poseeElPasaporte) {
        this.resultadoTesst = poseeElPasaporte;
    }
    private void setFechaDelTest(Fechas fechaDelTest) {
        this.fechaDelTest = fechaDelTest;
    }

    public boolean getResultadoTest() {
        return resultadoTesst;
    }

    public Fechas getFechaDelTest() {
        return fechaDelTest;
    }

    @Override
    public String toString() {
        return "PasaporteSanitario{ " +
                "Pasaporte Sanitario: " + resultadoTesst + "\n"+
                "Fecha del test: " + fechaDelTest + " }";
    }
}
