package Java.Java_polimorfismo;

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
