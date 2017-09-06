package coche;

/**
 * Clase que permite obtener los datos del transporte (coche)
 *
 * @author Medina Villalpando Josue de Jesus
 * @version 1.0
 * @since 03/09/17
 *
 */
public class Coche {

    String gasolina;
    String tipo;

    /**
     * @param gasolina Este recibe la cantidad de gasolina en galones del transporte
     */
    public Coche(int gasolina) {
        this.gasolina = String.valueOf(gasolina);
    }

    /**
     *
     * @param tipo Este recibe el tipo de de coche que utiliza
     */
    public Coche(String tipo) {
        this.tipo = tipo;
    }

}
