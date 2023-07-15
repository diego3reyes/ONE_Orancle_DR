package Java.Java_polimorfismo.modelo;

public class Administrador extends Funcionario implements Auntenticable {

    private AutenticacionUtil util;

    public Administrador(){
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return 200;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

}
