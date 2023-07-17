package servicio;

import entidad.Cliente;
import entidad.Rutina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppService {
    List<Cliente> listaClientes= new ArrayList();
    List<Rutina> listaRutinas= new ArrayList();
    ClienteService cs = new ClienteService();
    RutinaService rs = new RutinaService();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        int opc;
        do {
            System.out.println("***MENÚ PRINCIPAL***");
            System.out.println("Seleccione una opción");
            System.out.println("1. Ingresar o editar información sobre clientes");
            System.out.println("2. Ingresar o editar información sobre rutinas");
            System.out.println("3. Salir");
            opc = scan.nextInt();
            System.out.println("-----------------------------------");
            switch (opc) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuRutina();
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválide, intente nuevamente");
                    System.out.println("-----------------------------------");
                    menu();
            }
        }while (opc != 3) ;

    }
    public void menuCliente() {
        int opc;
        do {
            System.out.println("***MENÚ INFO CLIENTES***");
            System.out.println("Seleccione una opción");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Obtener clientes");
            System.out.println("3. Actualizar datos de un cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Volver al menú principal");
            opc = scan.nextInt();
            System.out.println("-----------------------------------");
            switch (opc) {
                case 1:
                    cs.crearCliente(listaClientes);
                    break;
                case 2:
                    cs.obtenerClientes(listaClientes);
                    break;
                case 3:
                    cs.actualizarCliente(listaClientes);
                    break;
                case 4:
                    cs.eliminarCliente(listaClientes);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Opción inválide, intente nuevamente");
                    System.out.println("-----------------------------------");
                    menuCliente();
            }
        } while(opc != 5);
    }
    public void menuRutina(){
        int opc;
        do {
            System.out.println("***MENÚ INFO RUTINAS***");
            System.out.println("Seleccione una opción");
            System.out.println("1. Crear rutina");
            System.out.println("2. Obtener rutinas");
            System.out.println("3. Actualizar datos de una rutina");
            System.out.println("4. Eliminar rutina");
            System.out.println("5. Volver al menú principal");
            opc = scan.nextInt();
            System.out.println("-----------------------------------");
            switch (opc) {
                case 1:
                    rs.crearRutina(listaRutinas);
                    break;
                case 2:
                    rs.obtenerRutinas(listaRutinas);
                    break;
                case 3:
                    rs.actualizarRutina(listaRutinas);
                    break;
                case 4:
                    rs.eliminarRutina(listaRutinas);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Opción inválide, intente nuevamente");
                    System.out.println("-----------------------------------");
                    menuRutina();
            }
        } while(opc != 5);
    }

}
