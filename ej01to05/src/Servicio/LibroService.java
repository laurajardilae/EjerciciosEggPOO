package Servicio;
import Entidad.Libro;
import java.util.Scanner;

public class LibroService {

    public Libro crearLibroService(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre del libro: ");
        String t = entrada.nextLine();
        System.out.println("Ingresa el ISBN: ");
        String cod= entrada.nextLine();
        System.out.println("Ingresa el autor: ");
        String a= entrada.nextLine();
        System.out.println("Ingresa el numero de páginas: ");
        int np= entrada.nextInt();

        return new Libro(cod,t,a,np);

    }

}
