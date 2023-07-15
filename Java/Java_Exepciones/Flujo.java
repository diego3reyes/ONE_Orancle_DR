package Java.Java_Exepciones;

public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        try {
            metodo1();
        } catch (MiException e) {
            e.printStackTrace();
        }
        System.out.println("Fin Main");
    }

    private static void metodo1() throws MiException {
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fin metodo1");
    }

    private static void metodo2() throws MiException {
        System.out.println("Inicio metodo2");
        throw new MiException("Surguio un Problema!!!");
        
    }
}
