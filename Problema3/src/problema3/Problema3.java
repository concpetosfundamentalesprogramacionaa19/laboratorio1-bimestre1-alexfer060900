/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nota1;
        String nota2;
        String nota3;
        double promedio; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextLine();
        System.out.println("Ingrese la segunda nota:");
        nota2 = entrada.nextLine();
        System.out.println("Ingrese la tercera nota:");
        nota3 = entrada.nextLine();
        
        promedio = (Double.parseDouble(nota1)+Double.parseDouble(nota2)+
                Double.parseDouble(nota3))/3;
        
        String resultado = promedio>14 ? "Si pasa el año" : "No pasa el año";
        System.out.printf("El estudiante %s\n", resultado);
                }
    
}
