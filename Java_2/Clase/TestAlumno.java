package Java_2.Clase;

public class TestAlumno {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Diego", "Reyes", 6);

        System.out.println("La id del alumno 2 es:" + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());


        System.out.println("-----------------");

        alu1.setId(8);
        alu1.setNombre("Rodrigo");
        alu1.setApellido("Rojas");

        System.out.println("La id del alumno 1 es:" + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

    }
}
