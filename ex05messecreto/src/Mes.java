import java.util.Random;

public class Mes {
    Random aleatorio = new Random();
    private String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto = meses[aleatorio.nextInt(0,12)];

    public Mes() {
    }

    public String getmesSecreto() {
        return mesSecreto;
    }

}
