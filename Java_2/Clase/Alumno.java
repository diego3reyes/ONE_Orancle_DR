package Java_2.Clase;

public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    double nota;

    public Alumno(int id, String nombre, String apellido, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public Alumno() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
