import entidad.Raices;
import servicio.service;

public class Main {
    public static void main(String[] args) {
        service servicio = new service();
        Raices ecuacion = servicio.crearEcuacion();
        servicio.calcular(ecuacion);

    }
}