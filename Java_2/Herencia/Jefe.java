package Java_2.Herencia;

public class Jefe extends Persona{
    int id_jefe;
    String departamento_jefe;

    public Jefe() {
    }

    public Jefe(int id_jefe, String departamento_jefe, int id, String dui, String nombre, String apellido,
            String dirreccion, String telefono) {
        super(id, dui, nombre, apellido, dirreccion, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

    public int getId_jefe() {
        return this.id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return this.departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }

}
