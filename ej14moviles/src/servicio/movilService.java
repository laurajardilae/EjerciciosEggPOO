package servicio;

import entidad.Movil;

import java.util.Scanner;

public class movilService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public Movil cargarCelular() {
        Movil m = new Movil();
        System.out.println("Ingrese la marca");
        m.setMarca(scan.next());
        System.out.println("Ingrese el precio");
        m.setPrecio(scan.nextFloat());
        System.out.println("Ingrese el modelo");
        m.setModelo(scan.next());
        System.out.println("Ingrese memoria RAM");
        m.setMemoriaRam(scan.nextFloat());
        System.out.println("Ingrese el almacenamiento");
        m.setAlmacenamiento(scan.nextFloat());
        m.setCodigo(ingresarCodigo());
        return m;
    }
    public int[] ingresarCodigo(){
        int[] cod=new int[7];
        for (int i = 0; i < 7; i++) {
            do{
                System.out.println("Ingrese el digito "+(i+1));
                cod[i]= scan.nextInt();
            }while (cod[i]<0||cod[i]>9);
        }
        return cod;
    }


}
