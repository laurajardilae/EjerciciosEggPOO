package entidad;

import java.util.Arrays;

public class Movil {
    private String marca;
    private float precio;
    private String modelo;
    private float memoriaRam;
    private float almacenamiento;
    private int[] codigo;

    public Movil() {
    }

    public Movil(String marca, float precio, String modelo, float memoriaRam, float almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(float memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil \n" +
                "Marca= " + marca + '\n' +
                "Precio= " + precio + '\n' +
                "Modelo= " + modelo + '\n'  +
                "MemoriaRam= " + memoriaRam + "GB\n" +
                "Almacenamiento= " + almacenamiento + "GB\n" +
                "Codigo= " + Arrays.toString(codigo) + '\n';
    }
}
