package servicio;

import entidad.Cliente;
import entidad.Rutina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RutinaService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void crearRutina(List listaRutinas){
        Rutina rutina = new Rutina();
        System.out.println("Ingrese el nombre de la rutina: ");
        rutina.setNombre(scan.nextLine());
        System.out.println("Ingrese la duración de la rutina (en minutos): ");
        rutina.setDuracion(Integer.parseInt(scan.nextLine()));
        dificultad(rutina);
        System.out.println("Ingrese la descripción de la rutina: ");
        rutina.setDescripcion(scan.nextLine());
        listaRutinas.add(rutina);
        System.out.println("La rutina ha sido creada con éxito");
        System.out.println("-----------------------------------");
    }
    public void dificultad(Rutina rutina){
        System.out.println("Seleccione la dificultad de la rutina:\n1. Básico\n2. Intermedio\n3. Avanzado");
        int opc=Integer.parseInt(scan.nextLine());
        switch (opc){
            case 1:
                rutina.setNivelDificultad("Básico");
                break;
            case 2:
                rutina.setNivelDificultad("Intermedio");
                break;
            case 3:
                rutina.setNivelDificultad("Avanzado");
                break;
            default:
                System.out.println("Opción inválida,intente nuevamente");
                dificultad(rutina);
        }
    }
    public void obtenerRutinas(List<Rutina> listaRutinas) {
        System.out.println("LISTA DE RUTINAS:");
        for (Rutina r: listaRutinas) {
            System.out.println("ID: "+r.getId());
            System.out.println("Nombre: "+r.getNombre());
            System.out.println("Duración: "+r.getDuracion());
            System.out.println("Nivel de doficultad: "+r.getNivelDificultad());
            System.out.println("Descripción: "+r.getDescripcion());
            System.out.println("---------------------");
        }
    }
    public void actualizarRutina(List<Rutina> lista) {
        System.out.println("Selecciona una rutina de la lista");
        obtenerRutinas(lista);
        Rutina r = lista.get(Integer.parseInt(scan.nextLine()));
        int opcion;
        do {
            System.out.println("Selecciona el atributo a cambiar:\n1. Nombre\n2. Duración\n3. Nivel de dificultad\n4. Descripción\n5. Ninguno");
            opcion = Integer.parseInt(scan.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nuevo nombre: ");
                    r.setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese nueva duración: ");
                    r.setDuracion(Integer.parseInt(scan.nextLine()));
                    break;
                case 3:
                    dificultad(r);
                    break;
                case 4:
                    System.out.println("Ingrese nueva descripción: ");
                    r.setDescripcion(scan.nextLine());
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente");
            }
            System.out.println(r.toString());
            System.out.println("-----------------------------------");
        } while (opcion != 5);
    }
    public void eliminarRutina(List<Rutina> lista){
        System.out.println("Selecciona una rutina de la lista");
        obtenerRutinas(lista);
        Rutina r = lista.get(Integer.parseInt(scan.nextLine()));
        lista.remove(r);
        System.out.println("La rutina ha sido eliminada con éxito");
        System.out.println("-----------------------------------");
    }

}
