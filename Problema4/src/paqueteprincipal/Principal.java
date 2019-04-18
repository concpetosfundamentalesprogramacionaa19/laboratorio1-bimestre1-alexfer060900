/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.MiClase1;
import paquete2.MiClase2;
import paquete3.MiClase3;
/**
 *
 * @author alexa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se compara para presentar el mensaje dependiendo de la edad
        String resultado = MiClase1.edad>18 ? "y mayor de edad" : "y menor de "
                + "edad";
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%s %s\n"
        ,MiClase2.nombre,MiClase3.Apellido,MiClase1.edad,resultado);
    }
    
}
