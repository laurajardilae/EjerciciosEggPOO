package Servicio;
import PersonaEntidad.Persona;
public class PersonaService {
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Nacionalidad: "+p.getNacionalidad());
    }
}
