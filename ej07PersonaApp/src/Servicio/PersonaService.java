package Servicio;

import Entidad.Persona;

import java.util.Scanner;

public class PersonaService {
    public Persona crearPersonaService(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.next();
        System.out.println("Ingrese su edad");
        int edad= entrada.nextInt();
        String sexo;
        boolean sexoCorecto;
        do {
            System.out.println("Ingrese su sexo (M/H/O)");
            sexo = entrada.next().toUpperCase();
            sexoCorecto=sexo.equals("M")||sexo.equals("H")||sexo.equals("O");
            if(!sexoCorecto){
                System.out.println("Ingrese el sexo nuevamente");
            }
        }while (!sexoCorecto);
        System.out.println("Ingrese su altura");
        double altura= entrada.nextDouble();
        System.out.println("Ingrese su peso");
        double peso= entrada.nextDouble();
        return new Persona(nombre,edad,sexo,altura,peso);
    }


}
