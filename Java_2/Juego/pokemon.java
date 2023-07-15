package Java_2.Juego;

public abstract class pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    protected String tipo;

    protected abstract void atacarPlacaje();

    protected abstract void atacarAranazo();

    protected abstract void atacarMordisco();

}
