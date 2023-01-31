/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciotrabalhador;

/**
 *
 * @author Taimo
 */
import java.io.*;
public class TrabalhadoresCriar {
    private int q;
    public TrabalhadoresCriar() throws IOException{ 
        q = validQuant(); 
    }
    
    private int validQuant() throws IOException{ 
     BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
    do{ 
        System.out.println("Quantos sao trabalhadores ? ");
            q = Integer.parseInt(a.readLine());
            if( q <= 0){
                System.out.println("Valor invalido! Tente de novo");
            }
    } while (q <= 0);
    return q; 
    
    }
    
    //Devolve a quantidade
    public int getQuant() { 
        return q; 
    }
    public float calcMedia()throws IOException{ 
        float soma = 0;
    for (int i = 1; i<= q; i++){ 
        System.out.println("Dados do "+i+"-o trabalhador:");
        Trabalhador trab = new Trabalhador();
        System.out.println(trab); //chamada do metodo toString()
        soma += trab.getIdade();
    }
    return Math.round(soma/q);
 }


}
