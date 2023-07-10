// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        puntoService ps = new puntoService();
        System.out.println("Punto numero 1");
        Punto p1 = ps.crearPunto();
        System.out.println("Punto numero 2");
        Punto p2 = ps.crearPunto();

        double distancia=ps.calcularDistancia(p1,p2);
        System.out.println("La distancia es: "+distancia);
    }
}