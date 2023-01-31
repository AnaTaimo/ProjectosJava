/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author Taimo
 */
public class Fibonacci {
///sequencia...-- 1,1,2,3,5,7,13,21
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int b = 0;
        int aux;
        
        
        for(int i = 0; i <30; i++){
            System.out.println(a); // 1
            aux = a;
            a = a+b;
            b = aux;
            
        }
    }
    
}
