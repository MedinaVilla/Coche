
package coche;

import java.util.Scanner;
/**
 * Programa que permite mediante constructores obtener los datos del tipo de coche que el usuario ingresa
 * @author Medina Villalpando Josue de Jesus 
 */
public class Transporte {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Ingrese los galones de gasolina para su coche");
       
        Coche coche = new Coche(scan.nextInt());
       
     
        System.out.println("Su coche tiene " + coche.gasolina + " galones de gasolina");
        
        System.out.println("Ingrese su tipo de coche");
        Coche coche2 = new Coche(scan.next());
        System.out.println("Su coche es un " + coche2.tipo);
        }
        catch(Exception e){
            System.out.println("Ingrese un dato valido");
        }
    }
    
}
