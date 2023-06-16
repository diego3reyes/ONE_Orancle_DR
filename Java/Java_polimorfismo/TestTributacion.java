package Java.Java_polimorfismo;

public class TestTributacion {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222, 333);
        cc.depositar(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImpuestos calc = new CalculadoraDeImpuestos();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImpuesto());
    }
}
