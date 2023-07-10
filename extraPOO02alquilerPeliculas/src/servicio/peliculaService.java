package servicio;

import entidad.Pelicula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class peliculaService {
    private ArrayList<Pelicula> listaPeliculas=new ArrayList<>();
    String[] generos = {"Terror","Comedia","Romance","Acción","Musical","Ciencia ficción"};
    public Scanner entrada = new Scanner(System.in).useDelimiter("\n");

    public void ingresarPelicula(){
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula: ");
        p.setNombre(entrada.next());
        System.out.println("Seleccione el género de la pelicula (ingrese el numero): ");
        for (int i = 0; i < generos.length; i++) {
            System.out.println((i+1)+". "+generos[i]);
        }
        int opc = entrada.nextInt();
        p.setGenero(generos[opc-1]);
        System.out.println("Ingrese la duración (en minutos): ");
        p.setDuracion(entrada.nextInt());
        System.out.println("Ingrese el año: ");
        p.setAnio(entrada.nextInt());
        listaPeliculas.add(p);
        System.out.println("La pelicula fue añadida correctamente");

    }
    public void buscarPelicula(){
        mostrarLista2();
        boolean encontrada=false;
        System.out.println("Ingresa la pelicula que deseas buscar");
        String pBusqueda = entrada.next();
        for (Pelicula p: listaPeliculas) {
            if(p.getNombre().equals(pBusqueda)){
                System.out.println("La pelicula esta en la lista");
                encontrada=true;
                break;
            }
        }
        if(!encontrada){
            System.out.println("La pelicula no se encuentra en la lista");
        }
    }
    public void buscarGenero(){
        boolean encontrada=false;
        System.out.println("Seleccione el género");
        for (int i = 0; i < generos.length; i++) {
            System.out.println((i+1)+". "+generos[i]);
        }
        int opc = entrada.nextInt();
        for (Pelicula p: listaPeliculas) {
            if(p.getGenero().equals(generos[opc-1])){
                System.out.println(p.getNombre());
                encontrada=true;
            }
        }
        if(encontrada==false){
            System.out.println("No hay pelicula de ese género");
        }

    }
    public void mostrarLista(){
        for (int i = 0; i < listaPeliculas.size(); i++) {
            System.out.println((i+1)+". "+listaPeliculas.get(i).getNombre());
        }

    }
    public void mostrarLista2(){
        listaPeliculas.forEach(peli-> System.out.println(peli));
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

}
