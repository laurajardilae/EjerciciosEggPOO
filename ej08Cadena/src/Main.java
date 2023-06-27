import entidad.Cadena;
import service.cadenaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cadenaService cs=new cadenaService();
        Scanner entrada=new Scanner(System.in).useDelimiter("\n");
        Cadena cad1= new Cadena();
        System.out.println("Ingrese una frase");
        cad1.setFrase(entrada.nextLine());
        cad1.setLongitud(cad1.getFrase().length());
        //MENU
        int opc;
        String aux;
        do{
            verMenu();
            opc= entrada.nextInt();
            switch (opc){
                case 1:
                    int vocales= cs.mostrarVocales(cad1);
                    System.out.printf("\nLa frase tiene %d vocales",vocales);
                    break;
                case 2:
                    System.out.println("Aqui está tu frase invertida:");
                    System.out.println(cs.invertirFrase(cad1));
                    break;
                case 3:
                    System.out.println("Ingrese una letra");
                    int repetido=cs.vecesRepetido(cad1, entrada.next().toLowerCase());
                    System.out.printf("La letra se repite %d veces",repetido);
                    break;
                case 4:
                    System.out.println("Ingrese una nueva frase");
                    aux = entrada.next();
                    cs.compararLongitud(cad1, aux);
                    break;
                case 5:
                    System.out.println("Ingrese una nueva frase");
                    aux = entrada.next();
                    cs.unirFrases(cad1, aux);
                    break;
                case 6:
                    System.out.println("Ingrese un caracter");
                    aux = entrada.next();
                    cs.reemplazar(cad1, aux);
                    break;
                case 7:
                    System.out.println("Ingrese un caracter");
                    aux = entrada.next();
                    System.out.println("La frase contiene el caracter ingresado: "+cs.contiene(cad1, aux));
                    break;
                case 8:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida");

            }
        }while (opc!=8);

    }
    public static void verMenu(){
        System.out.println("\nSeleccione una opción");
        System.out.println("1.Contar vocales\n2.Invertir la frase\n3.Contar un caracter\n4.Compara longitud\n5.Unir frases\n6.Reemplazar la 'a'\n7.Frase contiene\n8.Salir");
    }
}