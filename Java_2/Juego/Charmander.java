package Java_2.Juego;

public class Charmander extends pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y estoy atacando con Punio de Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y estoy atacando con Lanzallamas");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Charmander y estoy atacando con Aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y estoy atacando con Mordisco");
    }
    
}
