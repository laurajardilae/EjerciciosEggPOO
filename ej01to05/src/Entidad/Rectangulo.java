/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

public class Rectangulo {
    Scanner entrada=new Scanner(System.in);
    private double base;
    private double altura;


    public Rectangulo() {
        System.out.println("Ingrese la base");
        base= entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura= entrada.nextDouble();
    }
    public double superficie(){
        double resultado = base*altura;
        return resultado;
    }
    public double perimetro(){
        double resultado = (base+altura)*2;
        return resultado;
    }
    public void dibujar(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0||i==(altura-1)||j==0||j==(base-1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
