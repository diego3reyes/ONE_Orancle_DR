package Java.Java_polimorfismo.test;

import Java.Java_polimorfismo.modelo.Contador;
import Java.Java_polimorfismo.modelo.Funcionario;
import Java.Java_polimorfismo.modelo.Gerente;

public class TestReferencia {
    
    public static void main(String[] args) {

        Funcionario funcionario = new Contador();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(500.00);
        gerente.setSalario(2000.00);
    }
}
