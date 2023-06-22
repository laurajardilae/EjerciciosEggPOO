import Entidad.Vehiculo;
import Servicios.vehiculoService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehiculo vector[]= new Vehiculo[3];
        vector[0]= new Vehiculo("Toyota","Corolla",2023,"automovil");
        vector[1]= new Vehiculo("Suzuki","Vstrom",2018,"motocicleta");
        vector[2]= new Vehiculo("Best","A1",2020,"bicicleta");

        int tiempos[]={5,10,60,300};

        vehiculoService vs = new vehiculoService();

        for (int j = 0; j < 3; j++) {
            System.out.println("Avance de cada vehiculo en "+tiempos[j]+" segundos");
            for (int i = 0; i < 3; i++) {
                vs.moverse(vector[i],tiempos[j]);
                System.out.println("El vehiculo " + (i+1)+ " avanzó: "+vector[i].getPosicion());
            }
        }

        int aux=0,ganador=0;
        for (int i = 0; i < 3; i++) {
            vs.moverse(vector[i],tiempos[3]);
            vs.frenar(vector[i]);
            if (vector[i].getPosicion()>aux){
                aux=vector[i].getPosicion();
                ganador=i;
            }

        }
        System.out.println("El vehiculo que logró llegar mas lejos fue:"+ (ganador+1) +" y la cantidad de metros que avanzó fue:"+vector[ganador].getPosicion());





    }
}