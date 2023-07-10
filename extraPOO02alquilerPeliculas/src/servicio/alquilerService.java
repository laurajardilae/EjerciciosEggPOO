package servicio;

import entidad.Alquiler;
import entidad.Pelicula;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class alquilerService {

    public Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    peliculaService ps;
    private static ArrayList<Alquiler> listaAlquileres = new ArrayList<>();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public alquilerService(peliculaService ps) {
        this.ps = ps;
    }
    public void crearAlquiler(){
        ArrayList<Pelicula> listaDePeliculas = ps.getListaPeliculas();
        Alquiler a =new Alquiler();
        System.out.println("Seleccione el numero de la pelicula:");
        for (int i = 0; i < listaDePeliculas.size() ; i++) {
            System.out.println((i+1)+". "+listaDePeliculas.get(i).getNombre());
        }
        int opc = entrada.nextInt();
        a.setPelicula(ps.getListaPeliculas().get(opc-1));
        System.out.println("Ingrese la fecha de inicio del servicio (dd-MM-yyyy):");
        a.setInicio(LocalDate.parse(entrada.next(),formato));
        System.out.println("Ingrese la fecha de fin del servicio (dd-MM-yyyy):");
        a.setFin(LocalDate.parse(entrada.next(),formato));
        int dias = Period.between(a.getInicio(),a.getFin()).getDays()+1;
        int precio = 10;
        if (dias<=3){
            a.setPrecio(precio);
        } else if (dias>3) {
            a.setPrecio(precio+(precio*0.1)*(dias-3));
        }
        listaAlquileres.add(a);
    }

    public void buscarAlquiler(){
        boolean encontrado=false;
        System.out.println("Ingrese la fecha de inicio (dd-MM-yyyy):");
        LocalDate fechaU = LocalDate.parse(entrada.next(),formato);
        for (Alquiler a: listaAlquileres) {
            if(a.getInicio().equals(fechaU)){
                System.out.println(a.toString());
                encontrado=true;
            }
        }
        if (encontrado==false){
            System.out.println("No se encontró alquiler en esa fecha");
        }

    }
    public void totalAlquileres(){
        double total = listaAlquileres.stream().mapToDouble(a->a.getPrecio()).sum();
        System.out.println("El total es: "+total);
    }

    public ArrayList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

}

