/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geregrupo;

/**
 *
 * @author Taimo
 */
public class Aluno extends Pessoa{
   
    private float media;
    private byte classe;
    
    public Aluno(String nome,String endereco,byte idade,char sexo,
    byte classe,float media) {
        super(nome,endereco,idade,sexo);
        this.media = media;
        this.classe = classe;
    }
    public Aluno() { this("","",(byte)0,' ',(byte)0,0); }
    
    public float getMedia() {
        return media; 
    }
    public byte getClasse() {
        return classe;
    }
    public void setMedia(float media) { 
        this.media=media; 
    }
    public void setClasse(byte classe) {
        if(classe >= 1 && classe <= 12)
        this.classe = classe;
    }
    public String toString() {
        return super.toString()+"\nDados do Aluno:\tClasse: "+
        classe+" Media="+media;}
    
}
