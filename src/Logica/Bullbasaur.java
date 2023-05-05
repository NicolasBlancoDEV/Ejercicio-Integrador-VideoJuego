
package Logica;

public class Bullbasaur extends Pokemon implements IPlanta { //Aca implementamos la interfaz que le pertenece
    
    public Bullbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bullbasur y este es mi ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Hola soy Bullbasur y este es mi ataque araniazo!");  
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Hola soy Bullbasur y este es mi ataque mordisco!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bullbasur y este es mi ataque drenaje!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bullbasur y este es mi ataque paralizar!");
    }
    
}
