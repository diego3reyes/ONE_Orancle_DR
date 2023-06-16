package Java.Java_polimorfismo;

public class SistemaInterno {

    private String clave = "12345";
    
    public boolean autentica(Auntenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en Login");
            return false;
        }
    }
}
