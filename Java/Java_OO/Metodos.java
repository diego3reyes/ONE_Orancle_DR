package Java.Java_OO;

public class Metodos {
    public static void main(String[] args) {
        Cuenta cuentaDiego = new Cuenta(1);
        cuentaDiego.depositar(300);

        cuentaDiego.depositar(200.00);
        System.out.println(cuentaDiego.getSaldo());

        cuentaDiego.retirar(100.00);
        System.out.println(cuentaDiego.getSaldo());

        Cuenta cuentaGaby = new Cuenta(1);
        cuentaGaby.depositar(1000);

        if (cuentaGaby.transferir(400, cuentaDiego)) {
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Error en la transferencia");
        }

        System.out.println(cuentaGaby.getSaldo());
        System.out.println(cuentaDiego.getSaldo());
    }
}
