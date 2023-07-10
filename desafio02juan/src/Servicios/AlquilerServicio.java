/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Juan
 */
public class AlquilerServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(){
        Alquiler a = new Alquiler();
        
        System.out.println("Pelicula alquilada:");
        a.setPeliculaAlquilada(leer.next());
        
        System.out.println("dia mes y año de alquiler:");
        int dia, mes, anio;
        dia = leer.nextInt(); mes = leer.nextInt(); anio = leer.nextInt();
        LocalDate fechaInicio =  LocalDate.of(anio,mes,dia);
        a.setFechaInicio(fechaInicio);
        
        System.out.println("dia, mes y año de devolucion:");
        dia = leer.nextInt(); mes = leer.nextInt(); anio = leer.nextInt();
        LocalDate fechaFin = LocalDate.of(anio,mes,dia);
        a.setFechaFin(fechaFin);
        
        long diasAlq = ChronoUnit.DAYS.between(a.getFechaInicio(), a.getFechaFin());
        double precio;
        if(diasAlq > 3){
            precio = 10 + 11*(diasAlq-3);
        }else{
            precio = 10;
        }
        a.setPrecio(precio);
        
        listaAlquiladas[posAlq] = a;
        posAlq++;
        
        return a;
    }
    
    Alquiler[] listaAlquiladas = new Alquiler[2];
    int posAlq = 0;
    
    public void listaPeliculasAlquiladas(){
        System.out.println("Peliculas alquiladas:");
        for (int i = 0; i < listaAlquiladas.length; i++) {
            if(listaAlquiladas[i] != null){
                System.out.println(listaAlquiladas[i].toString());
            }else
                break;
        }
    }
    
    public void actualizarDisponibles(Pelicula[]lp){
        for (int i = 0; i < lp.length; i++) {
            for (int j = 0; j < listaAlquiladas.length; j++) {
                if(lp[i].getTitulo().equals(listaAlquiladas[j].getPeliculaAlquilada()))
                    lp[i].setDisponible(false);
                    break;
            }
        }
    }
    
    public boolean mostrarAlquilerPorFecha(){
        boolean disponible = false;
        int dia, mes, anio;
        System.out.println("Fecha de alquiler(dia, mes, año:");
        dia = leer.nextInt(); mes = leer.nextInt(); anio = leer.nextInt();
        LocalDate fecha = LocalDate.of(anio,mes,dia);
        for (int i = 0; i < listaAlquiladas.length; i++) {
            if(listaAlquiladas[i] != null){
                if(listaAlquiladas[i].getFechaInicio().equals(fecha)){
                    disponible = true;
                    System.out.println(listaAlquiladas[i].toString());
                }
            }else
                break;
        }
        return disponible;
    }
    
}
