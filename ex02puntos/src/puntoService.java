import java.util.Scanner;

public class puntoService {
    Scanner entrada=new Scanner(System.in);
    public Punto crearPunto(){
        System.out.println("Ingrese x: ");
        double x= entrada.nextInt();
        System.out.println("Ingrese y: ");
        double y= entrada.nextInt();
        Punto p = new Punto(x,y);
        return p;
    }

    public double calcularDistancia(Punto p1, Punto p2){
        double distancia=Math.sqrt((Math.pow(p2.getX()- p1.getX(),2)+(Math.pow(p2.getY()-p1.getY(),2))));
        return distancia;
    }
}
