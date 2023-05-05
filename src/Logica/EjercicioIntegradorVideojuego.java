
package Logica;

public class EjercicioIntegradorVideojuego {

    public static void main(String[] args) {
        Squartlie squir = new Squartlie();
        Charmander charmander = new Charmander();
        Bullbasaur bulba = new Bullbasaur();
        Pikachu pika = new Pikachu();
        
        squir.atacarAraniazo();
        squir.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLLama();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpacTrueno();
    }
    
}
