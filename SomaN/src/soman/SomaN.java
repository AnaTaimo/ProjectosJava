/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Taimo
 */
public class SomaN {
    //programa q faz entra 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        int n, impar = 0;
        
        do{
            System.out.println("DIGITE um numero, se digitar 0 interrope o prossecco");
            n = Integer.parseInt(a.readLine());
                for(int i = 1; i<=n; i++){
                    if(i%2 == 1){
                        impar = impar + i;
                    }
                }
                System.out.print("A soma dos numeros impasres de 1 ate " + n + "é igual a " + impar);
                impar = 0;
        
        }while (n>0);
        
    }
    
}
