import Entidad.Persona;
import Servicio.PersonaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();

        Persona vector[]=new Persona[4];

        boolean mayoriaEdad;
        int varPeso,personasMayores=0,personasMenores=0;;
        int debajo=0,ideal=0,sobre=0;

        /*vector[0]=new Persona("Laura",24,"m",1.60,72);
        vector[1]=new Persona("Ana",16,"m",1.60,60);
        vector[2]=new Persona("Juli",24,"m",1.60,50);
        vector[3]=new Persona("Ari",24,"h",1.60,40);*/
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el total de personas");
        int totalPer= entrada.nextInt();

        for (int i = 0; i < totalPer; i++) {
            Persona per = ps.crearPersonaService();
            System.out.println(per.toString());
            vector[i]=per;
            varPeso = vector[i].calcularIMC();
            switch (varPeso){
                case -1:
                    debajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    sobre++;
                    break;
            }


            mayoriaEdad = vector[i].esMayorDeEdad();
            if(mayoriaEdad==true){
                personasMayores++;
            }else{
                personasMenores++;
            }

        }
        System.out.format("\n%d%% están debajo del peso ideal, %d%% se encuentran en su peso ideal y %d%% están sobre el peso ideal.",debajo*100/totalPer,ideal*100/totalPer,sobre*100/totalPer);
        System.out.format("\nEl %d%% son mayores de edad y el %d%% son menores de edad.",personasMayores*100/totalPer,personasMenores*100/totalPer);


    }
}