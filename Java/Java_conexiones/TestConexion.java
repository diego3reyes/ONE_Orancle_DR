package Java.Java_conexiones;

public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();

        try {
            con.leerDatos();
        } catch (IllegalStateException e) {
            System.out.println("Recibiendo Exception");
            e.printStackTrace();
        }finally{
            System.out.println("Ejecutando Final");
            con.cerrar();
        }

    }
}
