package entidad;

public class Cliente {
    private static int generador=0;
    private int id;
    private String nombre;
    private int edad;
    private Double altura;
    private String objetivo;
    private double peso;

    public Cliente() {
        id=generador;
        generador++;
    }

    public Cliente(String nombre, int edad, Double altura, String objetivo, double peso) {
        id=generador;
        generador++;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.objetivo = objetivo;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public static int getGenerador() {
        return generador;
    }

    public static void setGenerador(int generador) {
        Cliente.generador = generador;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", objetivo='" + objetivo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
