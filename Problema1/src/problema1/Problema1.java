/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sueldo;
        int horas = 100;
        int costohora;
        int descuentoSeguro;
        int sueldocondesc;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese por favor el costo hora oficial:");
        costohora = entrada.nextInt();
       
       sueldo = costohora * horas;
       descuentoSeguro = (sueldo*10)/100;
       sueldocondesc = sueldo - descuentoSeguro;
        System.out.printf("El sueldo del trabajador por sus horas de servicio "
                + "es de: %s ,y el descuento del Seguro Social es de: %s\n,"
                + "por lo tanto, el total a pagar seria: %s\n" 
                ,sueldo ,descuentoSeguro, sueldocondesc);
    }
    
}
