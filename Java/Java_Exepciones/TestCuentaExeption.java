package Java.Java_Exepciones;

public class TestCuentaExeption {
    public static void main(String[] args) {
        Cuenta1 cuenta = new Cuenta1();

        try {
            cuenta.deposita();
        } catch (MiException e) {
            System.out.println("Atrapado");
            e.printStackTrace();
        }
    }
}
