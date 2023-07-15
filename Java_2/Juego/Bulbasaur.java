package Java_2.Juego;

public class Bulbasaur extends pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Latigo Cepa");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Mordisco");
    }
    
}
