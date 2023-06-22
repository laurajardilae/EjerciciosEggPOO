/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidad;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dni=" + dni +
                ", saldo=" + saldo +
                '}';
    }

    public void ingresar(int dinero){
        saldo+=dinero;
        System.out.println("Su nuevo saldo es: "+saldo);
    }
    public void retirar(int dinero){
        if(dinero>saldo){
            System.out.println("El monto sobrepasa su saldo");
            saldo=0;
        }else {
            saldo -= dinero;
            System.out.println("Su nuevo saldo es: "+saldo);
        }
    }
}
