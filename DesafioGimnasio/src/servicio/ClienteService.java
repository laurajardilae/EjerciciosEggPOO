package servicio;

import entidad.Cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void crearCliente(List<Cliente> listaClientes) {
        Cliente c = new Cliente();
        System.out.println("Ingrese nombre: ");
        c.setNombre(scan.nextLine());
        System.out.println("Ingrese edad: ");
        c.setEdad(Integer.parseInt(scan.nextLine()));
        System.out.println("Ingrese altura en metros: ");
        c.setAltura(Double.parseDouble(scan.nextLine()));
        System.out.println("Ingrese peso: ");
        c.setPeso(Double.parseDouble(scan.nextLine()));
        System.out.println("Ingrese el objetivo: ");
        c.setObjetivo(scan.nextLine());
        listaClientes.add(c);
        System.out.println("El cliente ha sido registrado con éxito");
        System.out.println("-----------------------------------");
    }
    public void obtenerClientes(List<Cliente> listaClientes) {
        for (Cliente c: listaClientes) {
            System.out.println("ID: "+c.getId());
            System.out.println("Nombre: "+c.getNombre());
            System.out.println("Edad: "+c.getEdad());
            System.out.println("Altura: "+c.getAltura());
            System.out.println("Objetivo: "+c.getObjetivo());
            System.out.println("---------------------");
        }
    }
    public void actualizarCliente(List<Cliente> lista) {
        System.out.println("Selecciona un cliente de la lista");
        obtenerClientes(lista);
        Cliente c1 = lista.get(Integer.parseInt(scan.nextLine()));
        int opcion;
        do {
            System.out.println("Selecciona el atributo a cambiar:\n1. Nombre\n2. Edad\n3. Altura\n4. Peso\n5. Objetivo\n6. Ninguno");
            opcion = Integer.parseInt(scan.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nuevo nombre: ");
                    c1.setNombre(scan.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese nueva edad: ");
                    c1.setEdad(Integer.parseInt(scan.nextLine()));
                    break;
                case 3:
                    System.out.println("Ingrese nueva altura: ");
                    c1.setAltura(Double.parseDouble(scan.nextLine()));
                    break;
                case 4:
                    System.out.println("Ingrese nuevo peso: ");
                    c1.setPeso(Double.parseDouble(scan.nextLine()));
                    break;
                case 5:
                    System.out.println("Ingrese nuevo objetivo: ");
                    c1.setObjetivo(scan.nextLine());
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente");
            }
            System.out.println(c1.toString());
            System.out.println("-----------------------------------");
        } while (opcion != 6);
    }
    public void eliminarCliente(List<Cliente> lista){
        System.out.println("Selecciona un cliente de la lista");
        obtenerClientes(lista);
        Cliente c = lista.get(Integer.parseInt(scan.nextLine()));
        lista.remove(c);
        System.out.println("El cliente ha sido eliminado con éxito");
        System.out.println("-----------------------------------");
    }

}


