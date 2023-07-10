/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicios.AlquilerServicio;
import Servicios.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class EjExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula [] listaPeliculas = new Pelicula[2];
        PeliculaServicio ps = new PeliculaServicio();
        AlquilerServicio as = new AlquilerServicio();
        Alquiler a;
        Pelicula p;
        int respuesta=0;
        
        do{
            respuesta = menu();
            switch(respuesta){
                case 1:
                       p = ps.crearPelicula();
                       break;
                case 2:
                       ps.crearListaPeliculas(listaPeliculas);
                       break;
                case 3:
                       a = as.crearAlquiler();
                       as.actualizarDisponibles(listaPeliculas);
                       break;
                case 4:
                       as.listaPeliculasAlquiladas();
                       as.actualizarDisponibles(listaPeliculas);
                       break;
                case 5:
                       ps.buscarPeliculaxTitulo(listaPeliculas);
                       break;
                case 6:
                       ps.buscarPeliculaxGenero(listaPeliculas);
                       break;
                case 7:
                        as.mostrarAlquilerPorFecha();
                default: System.out.println("Respuesta invalida");
                         break;
            }
        }while(respuesta != 8);
        
    }
    
    
    public static int menu(){
        int respuesta;
        Scanner leer = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Cargar Pelicula\n2. Crear lista de peliculas disponibles");
        System.out.println("3. Crear alquiler\n4. Mostrar lista de alquileres");
        System.out.println("5. Buscar pelicula por titulo\n6. Buscar pelicula por genero\n7. Buscar alquiler por fecha");
        System.out.println("8. Salir");
        respuesta = leer.nextInt();
        return respuesta;
    }
}
