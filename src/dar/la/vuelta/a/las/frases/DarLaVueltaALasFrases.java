/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dar.la.vuelta.a.las.frases;


import java.util.*;
/**
 *
 * @author Jesús Durántez Prieto
 */
public class DarLaVueltaALasFrases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        char[] arrayFrase;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca la frase que quiere invertir:");
        frase = teclado.nextLine();
        
        arrayFrase = frase.toCharArray();
        
        
        for (int i = (arrayFrase.length-1); i >= 0 ; i--){
            System.out.print(arrayFrase[i]);
        }
        System.out.println("");
    }
    
}
