import Service.PersonaService;
import entidad.Persona;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        p1.setEdad(ps.calcularEdad(p1));

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad que desea comparar");
        int edad2=entrada.nextInt();
        boolean esMenor = ps.menorQue(p1,edad2);

        if(esMenor){
            System.out.println(p1.getNombre()+" es menor a la nueva edad ingresada");
        }else{
            System.out.println(p1.getNombre()+" es mayor a la nueva edad ingresada");
        }


        System.out.println(p1.toString());
    }
}