
package Logica;


public abstract class Pokemon { //Clase Padre y la convertimos en una clase abstracta
    
    //ATRIBUTOS (Todos los pokemons van a tener los mismos atributos)
    protected int numPokedex; //Solo los hijos pueden tener acceso
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    //METODOS ABSTRACTOS (Tambien van a tener 3 ataques en comun)
    protected abstract void atacarPlacaje(); //Le agregamos abstract para que sepa que es un metodo abstracto,es las interfaces no es necesario
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
    
    
    
    
    
}
