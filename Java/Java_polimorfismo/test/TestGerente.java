package Java.Java_polimorfismo.test;

import Java.Java_polimorfismo.modelo.Gerente;

public class TestGerente {
    public static void main(String[] args) {
        // Funcionario gerente = new Funcionario();
        Gerente gerente = new Gerente();

        gerente.setSalario(6000.00);
        gerente.setTipo(1);

        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
    }
}
