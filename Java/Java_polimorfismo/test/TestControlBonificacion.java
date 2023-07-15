package Java.Java_polimorfismo.test;

import Java.Java_polimorfismo.modelo.*;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(1000);

        Contador alexiz = new Contador();
        alexiz.setSalario(500);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registraSalario(diego);
        controlBonificacion.registraSalario(jimena);
        controlBonificacion.registraSalario(alexiz);
    }
}
