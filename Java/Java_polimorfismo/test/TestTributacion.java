package Java.Java_polimorfismo.test;

import Java.Java_polimorfismo.modelo.CalculadoraDeImpuestos;
import Java.Java_polimorfismo.modelo.CuentaCorriente;
import Java.Java_polimorfismo.modelo.SeguroDeVida;

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
