package service;
import entidad.Cadena;

public class cadenaService {
    public int mostrarVocales(Cadena cad){
        int vocales=0;
        String vectorVocales[]= {"a","e","i","o","u"};
        for (int i = 0; i < cad.getLongitud(); i++) {
            for (int j = 0; j < 5; j++) {
                if (cad.getFrase().substring(i,i+1).toLowerCase().equals(vectorVocales[j])){
                    vocales++;
                }
            }
        }
        return vocales;
    }
    public String invertirFrase(Cadena cad){
        String fraseInvertida="";
        for (int i = cad.getLongitud()-1; i >= 0; i--) {
            fraseInvertida+=cad.getFrase().substring(i,i+1);

        }
        return fraseInvertida;
    }
    public int vecesRepetido(Cadena cad, String letra){
        int rep=0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().substring(i,i+1).toLowerCase().equals(letra)){
                rep++;
            }
        }
        return rep;
    }
    public void compararLongitud(Cadena cad,String nf){
        if(cad.getLongitud()==nf.length()){
            System.out.println("La longitud de ambas frases es igual");
        }else{
            System.out.println("La longitud de ambas frases es diferente");
        }
    }
    public void unirFrases(Cadena cad1,String f){
        System.out.println(cad1.getFrase()+f);
    }

    public void reemplazar(Cadena cad,String letra){
        String nuevaFrase="";
        for (int i = 0; i < cad.getLongitud(); i++) {
            if(cad.getFrase().substring(i,i+1).toLowerCase().equals("a")){
                nuevaFrase+=letra;
            }else{
                nuevaFrase+=cad.getFrase().substring(i,i+1);
            }
        }
        System.out.println(nuevaFrase);
    }

    public boolean contiene(Cadena cad,String letra){
        boolean siContiene=false;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if((cad.getFrase().substring(i,i+1).equals(letra))){
                siContiene=true;
                break;
            }
        }
        return siContiene;
    }
}
