package Java.Java_OO;

public class CrearCuenta {
    public static void main(String[] args) {
        //Primera instancia
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;
        // primeraCuenta.pais = "Peru"; No compila, no existe ese atributo
        System.out.println(primeraCuenta.saldo);
        //segunda instancia
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 2000;
        System.out.println(segundaCuenta.saldo);
    }
}
