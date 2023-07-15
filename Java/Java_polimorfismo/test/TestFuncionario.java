package Java.Java_polimorfismo.test;

import Java.Java_polimorfismo.modelo.Contador;
import Java.Java_polimorfismo.modelo.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Contador();

        diego.setNombre("Diego");
        diego.setDocumento("123456789");
        diego.setSalario(2000.00);
        diego.setTipo(0);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
