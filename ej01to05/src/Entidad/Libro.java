/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidad;

import java.util.Scanner;

public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int npaginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int npaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
    }

    Scanner entrada=new Scanner(System.in);
    public void crearLibro(){
        System.out.println("Ingresa el nombre del libro: ");
        titulo = entrada.nextLine();
        System.out.println("Ingresa el ISBN: ");
        ISBN= entrada.nextLine();
        System.out.println("Ingresa el autor: ");
        autor= entrada.nextLine();
        System.out.println("Ingresa el numero de páginas: ");
        npaginas= entrada.nextInt();
    }
    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", npaginas=" + npaginas +
                '}';
    }
}
