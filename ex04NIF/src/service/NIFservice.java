package service;

import entidad.NIF;

import java.util.Scanner;

public class NIFservice {
    Scanner entrada = new Scanner(System.in);
    String letras[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    public NIF crearNif(){
        NIF nif = new NIF();
        do{
            System.out.println("Ingrese el DNI");
            nif.setDNI(entrada.next());
        }while (nif.getDNI().length()<0||nif.getDNI().length()>8);

        nif.setLetra(letras[Integer.parseInt(nif.getDNI())%23]);
        return nif;
    }
    public void mostrar(NIF nif){

        System.out.println("Su NIF es: "+nif.getDNI()+"-"+nif.getLetra());
    }
}

