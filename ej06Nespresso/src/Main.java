import Entidad.Cafetera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Cafetera nes1 = new Cafetera(500,0);
        System.out.println("Bienvenido");
        int opc;
        do{
            System.out.println("Selecione una opción");
            System.out.println("1.LLenar cafetera\n2.Servir taza\n3.Vaciar cafetera\n4.Agregar café\n5.Salir");
            opc= entrada.nextInt();
            if(opc>=1||opc<=5){
                switch (opc){
                    case 1:
                        nes1.llenarCafetera();
                        break;
                    case 2:
                        System.out.println("Ingrese el tamaño de la taza");
                        int taza=nes1.servirTaza(entrada.nextInt());
                        System.out.println("Su taza tiene: "+taza);
                        break;
                    case 3:
                        nes1.vaciarCafetera();
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad de café");
                        nes1.agregarCafe(entrada.nextInt());
                        break;
                    case 5:
                        System.out.println("Hasta luego");
                        break;
                }
            }
        }while(opc!=5);
    }
}