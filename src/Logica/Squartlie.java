
package Logica;

public class Squartlie extends Pokemon implements IAgua {

    public Squartlie() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squartlie y este es mi ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squartlie y este es mi ataque aranizo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squartlie y este es mi ataque mordisco!");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squartlie y este es mi ataque Hidrobomba!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squartlie y este es mi ataque Burbuja!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squartlie y este es mi ataque Pistola de Agua!");
    }
    
}
