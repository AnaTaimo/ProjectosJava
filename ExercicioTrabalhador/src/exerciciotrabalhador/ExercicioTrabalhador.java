/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciotrabalhador;

import java.io.IOException;

/**
 *
 * @author Taimo
 */
public class ExercicioTrabalhador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       
        
        TrabalhadoresCriar t = new TrabalhadoresCriar();
        System.out.println ("idade media dos "+ t.getQuant()+
        " trabalhadores="+ t.calcMedia());
    }

    
    
}
