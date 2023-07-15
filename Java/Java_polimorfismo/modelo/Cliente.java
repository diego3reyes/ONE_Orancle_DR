package Java.Java_polimorfismo.modelo;

public class Cliente implements Auntenticable {

    private String nombre;
    private String documento;
    private String telefono;
    private AutenticacionUtil util;

    public Cliente(){
            this.util = new AutenticacionUtil();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
