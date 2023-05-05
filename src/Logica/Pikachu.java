
package Logica;

public class Pikachu extends Pokemon implements IElectrico { //Pikachu al ser un pokemon extiende de la clase abstracta Pokemon

    public Pikachu() {    }

    @Override
    protected void atacarPlacaje() {
        //Me trae los metodos de la clase abstracta Pokemon
        System.out.println("Hola soy Pikachu y este es mi ataque placaje!");
    }

    @Override
    protected void atacarAraniazo() { //Me trae los metodos de la clase abstracta Pokemon
        System.out.println("Hola soy Pikachu y este es mi ataque araniazo!");
    }

    @Override
    protected void atacarMordisco() { //Me trae los metodos de la clase abstracta Pokemon
       System.out.println("Hola soy Pikachu y este es mi ataque mordisco!");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impact trueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Punio Trueno!");
    }
    
}
