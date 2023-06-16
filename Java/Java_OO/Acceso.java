package Java.Java_OO;

public class Acceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());

        System.out.println(cuenta.getAgencia());

        cuenta.setNumero(23142314);
        System.out.println(cuenta.getNumero());
    }
}
