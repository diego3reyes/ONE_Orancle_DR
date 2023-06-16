package Java.Java_OO;

public class Referencia {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("0548");
        diego.setTelefono("78533248");

        Cuenta cuentaDiego = new Cuenta(1);
        cuentaDiego.titular = diego;

        System.out.println(cuentaDiego.titular.getDocumento());
    }
}
