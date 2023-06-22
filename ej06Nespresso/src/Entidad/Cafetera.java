package Entidad;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
        System.out.println("Su cafetera está llena");
        System.out.println("Cantidad actual: "+cantidadActual);
    }
    public int servirTaza(int taza){
        if(cantidadActual>taza){
            cantidadActual-=taza;
            System.out.println("Su taza está llena");
            System.out.println("Cantidad actual: "+cantidadActual);
        }else {
            taza=cantidadActual;
            cantidadActual=0;
            System.out.println("La cafetera está vacía");
            System.out.println("Cantidad actual: "+cantidadActual);
        }
        return taza;
    }
    public void vaciarCafetera(){
        cantidadActual=0;
        System.out.println("La cafetera está vacía");
        System.out.println("Cantidad actual: "+cantidadActual);
    }
    public void agregarCafe(int cafe){
        if((cantidadActual+cafe)<capacidadMaxima){
            cantidadActual+=cafe;
        }else{
            System.out.println("La cafetera está llena");
            cantidadActual=capacidadMaxima;
        }
        System.out.println("Cantidad actual: "+cantidadActual);
    }
}
