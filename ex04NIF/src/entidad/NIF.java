package entidad;

public class NIF {
    private String DNI;
    private String letra;

    public NIF() {
    }

    public NIF(String DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "DNI=" + DNI +
                ", letra='" + letra + '\'' +
                '}';
    }
}
