/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numfact;
import java.io.*;
/**
 *
 * @author Taimo
 */
public class NumFact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numero;
    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Digite o numero para calcular o factorial ");
    numero = Integer.parseInt(a.readLine());
    
    long factorial = 1;
    int i = 1;
    
    while (i<=numero){
        factorial = factorial * i;
        i++;
    }
    
/*
    ou for(int i =1; i<=numero; i++){
        factorial = factorial * i
    }
    
    */
    
    System.out.print( "O factorial é" + factorial);
    }
    
}
