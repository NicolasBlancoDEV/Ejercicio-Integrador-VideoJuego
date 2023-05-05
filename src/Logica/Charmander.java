
package Logica;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque araniazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Punio Fuego!");
    }

    @Override
    public void atacarLanzaLLama() {
        System.out.println("Hola soy Charmander y este es mi ataque Lanza Llamas!");
    }

    @Override
    public void atacarAsquas() {
        System.out.println("Hola soy Charmander y este es mi ataque Asquas!");
    }
    
}
