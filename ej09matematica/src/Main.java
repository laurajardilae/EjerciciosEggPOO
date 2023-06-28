import entidad.Matematica;

public class Main {
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        mat.setNum1(Math.random()*100);
        mat.setNum2(Math.random()*100);
        System.out.println(mat.toString());
        System.out.println("Numero mayor: "+mat.devolverMayor());
        System.out.println("Numero menor: "+mat.devolverMenor());
        System.out.println("Potencia: "+mat.calcularPotencia());
        System.out.println("Raíz: "+mat.calcularRaiz());
    }
}