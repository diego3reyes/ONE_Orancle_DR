package Java.Java_polimorfismo.modelo;

public class Gerente extends Funcionario implements Auntenticable {

    private AutenticacionUtil util;

    public Gerente(){
        this.util = new AutenticacionUtil();
    }

    public double getBonificacion() {
        return super.getSalario() + this.getSalario() * 0.1;
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
