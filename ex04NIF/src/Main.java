import entidad.NIF;
import service.NIFservice;


public class Main {
    public static void main(String[] args) {
        NIFservice servicio = new NIFservice();
        NIF nif1 = servicio.crearNif();
        servicio.mostrar(nif1);
    }
}