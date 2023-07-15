package Java_2.Juego;

public class Ejercicio {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();

        System.out.println("\n");
        squirtle.atacarAranazo();
        squirtle.atacarHidrobomba();
        System.out.println("\n");
        charmander.atacarAranazo();
        charmander.atacarLanzallamas();
        System.out.println("\n");
        bulba.atacarAranazo();
        bulba.atacarDrenaje();
        System.out.println("\n");
        pika.atacarAranazo();
        pika.atacarImpactrueno();
        System.out.println("\n");
    }
}
