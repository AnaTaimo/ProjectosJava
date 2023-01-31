/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geregrupo;

/**
 *
 * @author Taimo
 */
public class Pessoa {
    
   
    protected String nome, email;
    protected byte idade;
    protected char sexo;
    
    public Pessoa(String nome,String email,byte idade,char sexo) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public Pessoa() { this("","",(byte)0,' '); }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email=email; 
    }
    public void setSexo(char sexo) {
    if(sexo=='f' || sexo=='F' || sexo=='m' || sexo=='M')
    this.sexo=sexo;
    }
    public void setIdade(byte idade) {
        if(idade>5)
        this.idade=idade;
    }
    public String toString() {
        return "\nNome:"+nome+" Email:"+email+" idade:"+idade+"Sexo:"+sexo ;
    }
}
