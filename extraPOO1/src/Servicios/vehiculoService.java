package Servicios;

import Entidad.Vehiculo;

public class vehiculoService {
    public void moverse(Vehiculo v, int segundos){
        int velocidad=0;
        switch (v.getTipo()){
            case "automovil":
                velocidad=3;
                break;
            case "motocicleta":
                velocidad=2;
                break;
            case "bicicleta":
                velocidad=1;
                break;
        }
        v.setPosicion(segundos*velocidad);
    }
    public void frenar(Vehiculo v){
        switch (v.getTipo()) {
            case "bicicleta":
                break;
            default:
                v.setPosicion(v.getPosicion() + 2);
        }

    }
}
