package Java_2.Juego;

public class Pikachu extends pokemon implements IElectrico {


    public Pikachu() {
    }

    @Override
    public void atacarImpactrueno() {
       System.out.println("Hola soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y estoy atacando con Punio de Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu y estoy atacando con Rayo Carga");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Squirtle y estoy atacando con Aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y estoy atacando con Mordisco");
    }
    
}
