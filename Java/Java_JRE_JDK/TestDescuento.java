package Java.Java_JRE_JDK;

public class TestDescuento {
    public static void main(String[] args) {
        double valorCompra = 250.0;

        boolean porciento10 = valorCompra >= 100.0 && valorCompra <= 199.99;
        boolean porciento15 = valorCompra >= 200.0 && valorCompra <= 299.99;
        boolean porciento20 = valorCompra >= 300.0;

        double total = 0;
        double descuento = 0;

        if (porciento10) {
            total = valorCompra * 0.9;
            descuento = 10.0;
        } else if (porciento15) {
            total = valorCompra * 0.85;
            descuento = 15.0;
        } else if (porciento20) {
            total = valorCompra * 0.8;
            descuento = 20.0;
        }
        System.out.println("Bienvenido");
        System.out.println("Valor de la compra: $" + valorCompra);
        System.out.println("Descuento: " + descuento + "%");    
        System.out.println("Valor final: $"+ total);
    }

}
