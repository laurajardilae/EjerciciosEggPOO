import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String respuesta="";
        Mes mes = new Mes();
        do{
            respuesta=JOptionPane.showInputDialog("Adivina el mes secreto. Introduce el nombre del mes en minúsculas:");
            if (respuesta.equals(mes.getmesSecreto())){
                JOptionPane.showMessageDialog(null,"¡Has acertado!");
            }else{
                JOptionPane.showMessageDialog(null,"No has acertado. Intenta nuevamente.");
            }
        }while(!respuesta.equals(mes.getmesSecreto()));
    }
}