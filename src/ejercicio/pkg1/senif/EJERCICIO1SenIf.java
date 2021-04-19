/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.senif;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class EJERCICIO1SenIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numero1;
        int numero2;
        Scanner Leer = new Scanner(System.in);
        System.out.println("INGRESA UN VALOR 1:");
        numero1 = Leer.nextInt();
        System.out.println("INGRESA UN VALOR 2:");
        numero2 = Leer.nextInt();
     
        if (numero1 > numero2) {
            System.out.println("VALOR 1 MAYOR ");
        } else if ( numero1 < numero2) {
            System.out.println("VALOR 2 MAYOR");
            
        }
    }
    
}
