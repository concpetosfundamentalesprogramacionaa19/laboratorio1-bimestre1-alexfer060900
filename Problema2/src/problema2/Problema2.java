/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double m;
        String x;
        String y;
        String z;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de x: ");
        x = entrada.nextLine();
        System.out.println("Ingrese el valor de y: ");
        y = entrada.nextLine();
        System.out.println("Ingrese el valor de z: ");
        z = entrada.nextLine();
        
        double valorx = Double.parseDouble(x);
        double valory = Double.parseDouble(y);
        double valorz = Double.parseDouble(z);
        
        m = (valorx + valory/valorz)/(valorx - valory/valorz);
        
        System.out.printf("El valor de m, en base a las variables:\n"
                + "x = %s\n\t y = %s \n\t\t z = %s\n da como resultado:\n\t\t\t"
                + "m = %.1f ",x,y,z,m);
    }
    
}
