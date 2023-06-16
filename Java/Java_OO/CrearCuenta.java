package Java.Java_OO;

public class CrearCuenta {
    public static void main(String[] args) {
        //Primera instancia
        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.depositar(1000);
        // primeraCuenta.pais = "Peru"; No compila, no existe ese atributo
        System.out.println(primeraCuenta.getSaldo());
        //segunda instancia
        Cuenta segundaCuenta = new Cuenta(1);
        segundaCuenta.depositar(200);
        System.out.println(segundaCuenta.getSaldo());
    }
}
