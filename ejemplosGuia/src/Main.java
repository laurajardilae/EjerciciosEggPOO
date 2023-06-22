import PersonaEntidad.Persona;
import Servicio.PersonaService;
public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona("Laura","Colombiana",24);
        //Uso de getter y setter
        System.out.println(p1.getNombre());
        p1.setEdad(15);
        System.out.println(p1.toString()+"\n");

        //Uso de clase servicio
        PersonaService serv =new PersonaService();
        serv.mostrarPersona(p1);

    }
}