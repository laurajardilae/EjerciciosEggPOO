import entidad.Curso;
import servicio.cursoService;

public class Main {
    public static void main(String[] args) {


        cursoService cs=new cursoService();
        Curso c1 = cs.crearCurso();
        System.out.println(c1.toString());
        System.out.println("La ganancia semanal para este curso es: "+cs.calcularGananciaSemanal(c1));


            

    }
    
}