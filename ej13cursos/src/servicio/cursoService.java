package servicio;

import entidad.Curso;

import java.util.Scanner;

public class cursoService {
    public Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public void cargarAlumnos(Curso c){
        String vector[]=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno "+i+": ");
            vector[i]= entrada.next();
        }
        c.setAlumnos(vector);
    }

    public Curso crearCurso(){
        Curso c=new Curso();
        System.out.println("Ingrese el nombre del curso");
        c.setNombre(entrada.nextLine());
        System.out.println("Ingrese la cantidad de horas por día");
        c.setCantidadHorasPorDia(entrada.nextInt());
        System.out.println("Ingrese la cantidad de días por semana");
        c.setCantidadDiasPorSemana(entrada.nextInt());
        int opc;
        do{
            System.out.println("Ingrese opción (1) para el turno de la mañana y opción (2) para el turno de la tarde");
            opc= entrada.nextInt();
            if(opc==1){
                c.setTurno("Mañana");
            } else if (opc==2) {
                c.setTurno("Tarde");
            }else {
                System.out.println("Opción invalida,intente nuevamente");
            }
        }while(opc!=1&&opc!=2);
        System.out.println("Ingrese precio por hora");
        c.setPrecioPorHora(entrada.nextDouble());
        cargarAlumnos(c);
        return c;
    }

    public double calcularGananciaSemanal(Curso c){
        double ganancia= c.getCantidadHorasPorDia()*c.getCantidadDiasPorSemana()*c.getPrecioPorHora()*5;

        return ganancia;
    }

}
