
package coche;
/**
 * Clase que permite obtener los datos del transporte (coche)
 * @author Medina Villalpando Josue de Jesus 
 */
public class Coche {
    String gasolina;
    String tipo;
  
    public Coche(int gasolina){
        this.gasolina = String.valueOf(gasolina);
    }
    
    public Coche(String tipo){
        this.tipo = tipo;
    }
    
    
}

