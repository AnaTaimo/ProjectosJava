/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerirvestidos;

import java.text.DecimalFormat; 
import java.io.*;

/**
 *
 * @author Taimo
 */
public class Vestido {
    
    
    private String nome;
    private int quant;
    private float preco;
    private float total;
    private DecimalFormat moeda;
    
    public Vestido(String no, int qu, float pr) {
        nome = no;
        quant = qu;
        preco = pr;
        total = calcTotal();
        moeda = new DecimalFormat ("###,###.00 Mt");
    }
    
    private float calcTotal(){
        return quant*preco; 
    }
    
    public float getTotal() {
        return total; 
    }
    public String getNome() {
        return nome; 
    }
    
    public String toString(){
        return nome+"\t"+quant+" de preco "+ moeda.format(preco)+ "\ttotal="+ moeda.format(total);
    }

}
