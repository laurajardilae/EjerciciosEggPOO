/*  **ATRIBUTOS**
    {p,a,l,a,b,r,a} Cree un vector secreto
    {_,_,_,_,_,_,_} Cree un vecto usuario con la misma cantidad de espacios
*/
package entidad;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ahorcado {

    private Vector<String> vectorSecreto;
    private Vector<String> vectorUsuario;
    private int intentos;
    Scanner entrada = new Scanner(System.in);

    public void crearJuego(){
        System.out.println("---BIENVENIDO---");
        intentos = dificultad();
        vectorSecreto = crearVectorSecreto();
        vectorUsuario = crearVectorUsuario();
        System.out.printf("La palabra contiene %d letras y te puedes equivocar %d veces\n",vectorSecreto.size(),intentos);
    }
    public void jugar(){
        do{
            System.out.println("Ingresa una letra");
            buscar(entrada.next());
        }while(intentos>0&&!palabraAdivinada());//repetimos mientras hayan intentos y la palabra no haya sido adivinada
    }
    public int dificultad(){
        System.out.println("Selecciona el nivel de dificultad:");
        System.out.println("OJO, a mayor dificultad menor número de intentos...");
        System.out.println("1.Dificil\n2.Intermedio\n3.Facil");
        int seleccion=entrada.nextInt();
        if(seleccion>=1&&seleccion<=3){
            return seleccion*2;
        }else{
            System.out.println("Opción inválida");
            return dificultad(); //Si la opcion es invalida retorno el metodo de manera recursiva
        }
    }
    public Vector<String> crearVectorSecreto(){
        Random aleatorio = new Random();
        String palabras[] = temas(); //Seleccion del tema
        String palabra = palabras[aleatorio.nextInt(palabras.length)]; //Seleccion de la palabra
        Vector<String> vector=new Vector<>(); //Convierto la palabra en un vector
        for (int i = 0; i < palabra.length(); i++) {
            vector.add(palabra.substring(i,i+1));
        }
        return vector;
    }
    public String[] temas(){
        System.out.println("Selecciona un tema\n1.Meses del año\n2.Colores\n3.Animales");
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String colores[] = {"amarillo", "celeste", "lila", "rosado", "verde"};
        String animales[] = {"gato", "perro", "vaca", "leon", "mono", "capibara"};
        int opc= entrada.nextInt();
        switch (opc){
            case 1:
                return meses;
            case 2:
                return colores;
            case 3:
                return animales;
            default:
                System.out.println("Opción inválida");
                return temas(); //Si la opcion es invalida retorno el metodo de manera recursiva
        }
    }
    public Vector<String> crearVectorUsuario(){
        Vector<String> vector = new Vector<>();
        for (int i = 0; i < vectorSecreto.size(); i++) {
            vector.add("_");
        }
        return vector;
    }

    public void buscar(String letraUsu){
        boolean correcta=false;
        for (int i = 0; i < vectorSecreto.size(); i++) {
            if(letraUsu.equalsIgnoreCase(vectorSecreto.elementAt(i))){
                vectorUsuario.set(i,vectorSecreto.elementAt(i));
                correcta=true;
            }
        }
        if(correcta){
            System.out.println("¡Yupi! La letra es correcta");
        }else{
            System.out.println("Letra incorrecta :(");
            intentos--;
            if(intentos>0){
                System.out.println("Intenta nuevamente...");
                System.out.format("Te quedan %d intentos\n",intentos);
            } else if (intentos==0) {
                System.out.println("Perdiste :(");
            }
        }
        System.out.println(vectorUsuario.toString());

        System.out.println("----------------------------");
    }
    public boolean palabraAdivinada(){
        boolean gano = !vectorUsuario.contains("_"); //La palabra fue adivinada cuando ya NO contiene guiones
        if(gano){
            System.out.println("╔═════════════════════════╗");
            System.out.println("║        ¡GANASTE!        ║");
            System.out.println("╚═════════════════════════╝");
        }
        return gano;
    }



    public Ahorcado() {
    }

    public Vector<String> getVectorSecreto() {
        return vectorSecreto;
    }


    public Vector<String> getVectorUsuario() {
        return vectorUsuario;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
}
