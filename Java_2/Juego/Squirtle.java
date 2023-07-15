package Java_2.Juego;

public class Squirtle extends pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y estoy atacando con Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y estoy atacando con Pistola de Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle y estoy atacando con Hidropulso");
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
