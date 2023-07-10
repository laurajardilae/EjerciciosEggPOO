/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Pelicula;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        Pelicula p = new Pelicula();
        
        System.out.println("Titulo de la pelicula:");
        p.setTitulo(leer.next());
        System.out.println("Año de lanzamiento:");
        p.setAnio(leer.nextInt());
        System.out.println("Genero:");
        p.setGenero(leer.next());
        System.out.println("Duracion (minutos):");
        p.setDuracion(leer.nextInt());
        p.setDisponible(true);
        
        return p;
    }
    
    public void crearListaPeliculas(Pelicula[] listaPeliculas){
        for (int i = 0; i < listaPeliculas.length; i++) {
            listaPeliculas[i] = crearPelicula();
        }
    }
    
    public void listaPeliculasDisponibles(Pelicula[] listaPeliculas){
        System.out.println("Peliculas Disponibles:");
        for (int i = 0; i < listaPeliculas.length; i++) {
            if(listaPeliculas[i].getDisponible() == true){
                System.out.println(listaPeliculas[i].toString());
            }
        }
    }
    
    public boolean buscarPeliculaxTitulo(Pelicula[] listaPeliculas){
        boolean disponible = false;
        System.out.println("Titulo de la pelicula que busca:");
        String titulo = leer.next();
        for (int i = 0; i < listaPeliculas.length; i++) {
            if(listaPeliculas[i].getTitulo().equals(titulo)){
                disponible = true;
                System.out.println(listaPeliculas[i].toString());
                break;
            }
        }
        return disponible;
    }
    
    public boolean buscarPeliculaxGenero(Pelicula[] listaPeliculas){
        boolean disponible = false;
        System.out.println("Genero de la pelicula que busca:");
        String genero = leer.next();
        for (int i = 0; i < listaPeliculas.length; i++) {
            if(listaPeliculas[i].getGenero().equals(genero)){
                disponible = true;
                System.out.println(listaPeliculas[i].toString());
            }
        }
        return disponible;
    }
    
    
    
}
