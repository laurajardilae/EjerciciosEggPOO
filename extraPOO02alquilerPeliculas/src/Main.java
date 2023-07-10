import entidad.Pelicula;
import servicio.alquilerService;
import servicio.peliculaService;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        peliculaService ps = new peliculaService();
        alquilerService as = new alquilerService(ps);
        int opc;
        do{
            imprimirMenu();
            opc = entrada.nextInt();
            switch (opc){
                case 1:
                    ps.ingresarPelicula();
                    break;
                case 2:
                    as.crearAlquiler();
                    break;
                case 3:
                    System.out.println(ps.getListaPeliculas().toString());
                    break;
                case 4:
                    System.out.println(as.getListaAlquileres().toString());
                    break;
                case 5:
                    ps.buscarPelicula();
                    break;
                case 6:
                    ps.buscarGenero();
                    break;
                case 7:
                    as.buscarAlquiler();
                    break;
                case 8:
                    as.totalAlquileres();
                    break;
                case 9:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }while (opc!=9);



    }
    public static void imprimirMenu(){
        System.out.println("\n***MENÚ***");
        System.out.println("1.Crear película\n2.Crear alquiler");
        System.out.println("3.Listar todas las peliculas\n4.Listar alquileres");
        System.out.println("5.Buscar pelicula por titulo\n6.Buscar pelicula por genero");
        System.out.println("7.Buscar alquiler por fecha de inicio\n8.Calcular el ingreso total del servicio");
        System.out.println("9.Salir");

    }
}
