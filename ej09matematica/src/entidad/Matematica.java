package entidad;

public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor(){
        return Math.max(num1,num2);
    }
    public double devolverMenor(){
        return Math.min(num1,num2);
    }

    public double calcularPotencia(){
        return Math.pow(Math.round(devolverMayor()),Math.round(devolverMenor()));
    }

    public double calcularRaiz(){
        return Math.sqrt(Math.abs(devolverMenor()));
    }

    @Override
    public String toString() {
        return "Matematica{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
