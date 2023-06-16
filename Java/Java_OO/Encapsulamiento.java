package Java.Java_OO;

public class Encapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        Cliente cliente = new Cliente();

        cliente.setNombre("Diego");
        cliente.setDocumento("12038249wrdjpqwd");

        cuenta.setTitular(cliente);

        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
