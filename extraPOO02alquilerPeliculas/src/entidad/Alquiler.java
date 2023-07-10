package entidad;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler {
    private Pelicula pelicula;
    private LocalDate inicio;
    private LocalDate fin;
    private double precio;

    public Alquiler() {
    }


    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "pelicula=" + pelicula +
                ", inicio=" + inicio +
                ", fin=" + fin +
                ", precio=" + precio +
                '}';
    }
}
