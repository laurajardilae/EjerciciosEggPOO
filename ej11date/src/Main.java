import java.util.Date;
import java.util.Scanner;

/*
En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el día");
        int dia= entrada.nextInt();
        System.out.println("Ingrese el mes");
        int mes= entrada.nextInt();
        System.out.println("Ingrese el año");
        int anio= entrada.nextInt();

        Date fecha=new Date(anio-1900,mes-1,dia);
        System.out.println(fecha);

        Date fechaActual=new Date();
        System.out.println(fechaActual);

        System.out.println("Años transcurridos: "+(fechaActual.getYear()-fecha.getYear()));

    }
}