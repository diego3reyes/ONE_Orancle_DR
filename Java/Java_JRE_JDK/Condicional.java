package Java.Java_JRE_JDK;

public class Condicional {
    public static void main(String[] args) {
        int edad = 19;
        int cantidad = 1;

        if (edad >= 18) {
            System.out.println("Usted puede entrar");
        } else if (cantidad >= 2) {
            System.out.println("no tienes 18 años, pero puedes ingresar porque estás acompañado");
        } else {
            System.out.println("Usted no esta permitido a entrar");
        }
    }
}
