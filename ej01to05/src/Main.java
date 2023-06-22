// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Entidad.Cuenta;
import Servicio.CuentaService;
import Servicio.LibroService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*EJERCICIO 1*--------------------------
        Libro libro1 = new Libro();
        libro1.crearLibro();
        System.out.println(libro1.toString());

        //Uso de servicio
        LibroService ls=new LibroService();
        Libro libro2 = ls.crearLibroService();
        System.out.println(libro2.toString());
        */

        /*EJERCICIO 2----------------------------
        Circunferencia c1=new Circunferencia(5);
        System.out.println(c1.toString());
        c1.crearCircunferencia();
        System.out.println(c1.toString());
        double area = c1.area();
        System.out.println("El area es: " +area);
        double peri = c1.perimetro();
        System.out.println("El perimetro es: "+peri);
         */
        /*EJERCICIO 3------------------------------
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        int suma=op1.sumar();
        int resta=op1.restar();
        System.out.printf("Suma= %d\nResta= %d\n",suma,resta);
        int multiplicacion= op1.multiplicar();
        System.out.println("Multiplicación="+multiplicacion);
        int division= op1.dividir();
        System.out.println("División="+division);*/

        /*EJERCICIO 4
        Rectangulo r1=new Rectangulo();
        System.out.println("Superficie= "+r1.superficie());
        System.out.println("Perimetro= "+r1.perimetro());
        r1.dibujar();
        */
        //EJERCICIO 5
        //Creo una cuenta usando el sericio
        CuentaService cs = new CuentaService();
        Cuenta c1 = cs.crearCuentaService();
        int opc;
        do{
            System.out.println("Seleccione una opción\n1.Ingresar dinero\n2.Retirar dinero\n3.Extracción rápida\n4.Consultar saldo\n5.Consultar datos de la cuenta\n6.Salir");
            opc=entrada.nextInt();
            if(opc>=1||opc<=5){
                switch (opc){
                    case 1:
                        System.out.println("Indique el monto a ingresar");
                        c1.ingresar(entrada.nextInt());
                        break;
                    case 2:
                        System.out.println("Indique el monto a retirar");
                        c1.retirar(entrada.nextInt());
                        break;
                    case 3:
                        System.out.println("Indique el monto a retirar");
                        int dinero = entrada.nextInt();
                        if(dinero<(c1.getSaldo()*0.2)){
                            c1.retirar(dinero);
                        }else{
                            System.out.println("El monto supera el permitido para extracción rápida");
                        }
                        break;
                    case 4:
                        System.out.println("Su saldo es: "+c1.getSaldo());
                        break;
                    case 5:
                        System.out.println("El DNI registrado es "+c1.getDni()+" y el numero de cuenta es "+c1.getNumeroCuenta());
                        break;
                    case 6:
                        System.out.println("Hasta luego");
                }
            }

        }while (opc!=6);



    }
}