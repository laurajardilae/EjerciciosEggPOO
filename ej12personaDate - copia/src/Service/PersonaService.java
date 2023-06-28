package Service;

import entidad.Persona;


import java.time.LocalDate;
import java.util.Scanner;

public class PersonaService {
    Scanner entrada = new Scanner(System.in);
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre completo");
        String name= entrada.nextLine();
        System.out.println("Ingrese año de nacimiento");
        int anio= entrada.nextInt();
        System.out.println("Ingrese el mes");
        int mes= entrada.nextInt();
        System.out.println("Ingrese el día");
        int dia= entrada.nextInt();
        LocalDate fecha=LocalDate.of(anio,mes,dia);
        Persona p = new Persona(name,fecha);
        return p;
    }
    public int calcularEdad(Persona p){
        LocalDate actual = LocalDate.now();
        int edad = actual.getYear()-p.getFechaNacimiento().getYear();
        if(p.getFechaNacimiento().getMonthValue()>actual.getMonthValue()){
            edad-=1;
        }
        return edad;
    }

    public boolean menorQue(Persona p,int edad2){
        boolean esMenor=false;
        if(p.getEdad()<edad2){
            esMenor=true;
        }
        return esMenor;
    }
}
