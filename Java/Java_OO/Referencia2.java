package Java.Java_OO;

public class Referencia2 {
    public static void main(String[] args) {
        Cuenta cuentaDiego = new Cuenta(1);

        cuentaDiego.titular.setNombre("Diego");

        System.out.println(cuentaDiego.titular.getNombre());
    }
}
