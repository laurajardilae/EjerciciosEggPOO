package servicio;

import entidad.Raices;

import java.util.Scanner;

public class service {
    Scanner entrada = new Scanner(System.in);

    public Raices crearEcuacion() {
        Raices r = new Raices();
        System.out.println("Ingrese el valor de a");
        r.setA(entrada.nextDouble());
        System.out.println("Ingrese el valor de b");
        r.setB(entrada.nextDouble());
        System.out.println("Ingrese el valor de c");
        r.setC(entrada.nextDouble());
        return r;
    }

    public double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }

    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }
    public void obtenerRaices(Raices ecuacion) {
        if (tieneRaices(ecuacion)) {
            System.out.println("las dos soluciones son: ");
            double s1 = (-ecuacion.getB() + Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            double s2 = (-ecuacion.getB() - Math.sqrt(getDiscriminante(ecuacion))) / (2 * ecuacion.getA());
            System.out.println("solucion 1: " + s1);
            System.out.println("solucion 2: " + s2);
        }
    }

    public void obtenerRaiz(Raices ecuacion) {
        if (tieneRaiz(ecuacion)) {
            double s = -ecuacion.getB() / (2 * ecuacion.getA());
            System.out.println("la solucion de la ecuación es: " + s);
        }
    }

    public void calcular(Raices ecuacion) {
        if (tieneRaiz(ecuacion)) {
            obtenerRaiz(ecuacion);
        } else if (tieneRaices(ecuacion)) {
            obtenerRaices(ecuacion);
        } else {
            System.out.println("la ecuación no tiene solucion real");
        }
    }
}
