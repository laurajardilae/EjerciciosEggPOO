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
        System.out.println("La persona es menor a la nueva edad ingresada: "+esMenor);

        System.out.println(p1.toString());
    }
}