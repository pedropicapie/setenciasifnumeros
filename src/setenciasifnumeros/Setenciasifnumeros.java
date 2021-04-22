/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setenciasifnumeros;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Setenciasifnumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese su primer numero");
        int numero1  = leer.nextInt();
        
        Scanner leer2 = new Scanner(System.in);
        
        System.out.println("ingrese su segundo numero");
        int numero2 = leer2.nextInt();
        
        if (numero1>numero2){
            System.out.println("Es mayor el numero " +numero1);            
        }else if (numero1<numero2){
            System.out.println("Es menor el numero " +numero1);
            System.out.println("mayor el numero" +numero2);
            
        }else{
            System.out.println("Numeros son iguales");
        }
            
        
    }
    
}
