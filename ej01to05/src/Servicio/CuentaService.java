package Servicio;

import Entidad.Cuenta;

import java.util.Scanner;

public class CuentaService {
    public Cuenta crearCuentaService(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de cuenta: ");
        int c = entrada.nextInt();
        System.out.println("Ingrese DNI: ");
        long d = entrada.nextLong();
        return new Cuenta(c,d);

    }


}
