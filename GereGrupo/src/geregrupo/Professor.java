/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geregrupo;

/**
 *
 * @author Taimo
 */
public class Professor extends Pessoa {
 
    private byte numHoras;
    public Professor(String nome,String email,byte idade,char sexo,
    byte numHoras) {
        super(nome,email,idade,sexo);
        this.numHoras = numHoras;
    }
    public Professor() {
        this("","",(byte)0,' ',(byte)0);
    }
    public byte getNumHoras() { 
        return numHoras; 
    }
    public void setNumHoras(byte numHoras) {
        if(numHoras>0)
    this.numHoras=numHoras;
    }
    public String toString(){
        return super.toString()+"\t\nDados do PROFESSOR: "+
        " Numero de Horas: "+numHoras;
    }
     
    
}
