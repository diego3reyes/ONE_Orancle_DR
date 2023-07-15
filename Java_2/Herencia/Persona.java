package Java_2.Herencia;

public class Persona {
    int id;
    String dui;
    String nombre;
    String apellido;
    String dirreccion;
    String telefono;


    public Persona() {
    }

    public Persona(int id, String dui, String nombre, String apellido, String dirreccion, String telefono) {
        this.id = id;
        this.dui = dui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirreccion = dirreccion;
        this.telefono = telefono;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDui() {
        return this.dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirreccion() {
        return this.dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
