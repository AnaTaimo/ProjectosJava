/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geregrupo;

/**
 *
 * @author Taimo
 */
import java.util.*;
import java.io.*;
public class Tarefas {
 
    private Vector v;
    
    public Tarefas () { 
        v = new Vector();
    }
    public void lerFichTxt() throws IOException {
    String umaLinha = "", nom = "", em = "";
    StringTokenizer x;
    char sex,criterio; byte id,niv,htrab;
    float med,sal;
    try {
        BufferedReader fr=
        new BufferedReader(new FileReader("Info.txt"));
        umaLinha= fr.readLine();
        while(umaLinha != null) {
        x = new StringTokenizer(umaLinha,";");
        nom = x.nextToken();
        em = x.nextToken();
        id = Byte.parseByte(x.nextToken());
        sex= (x.nextToken()).charAt(0);
        criterio = (x.nextToken()).charAt(0);

    if (criterio == 'a' || criterio == 'A') {
        niv = Byte.parseByte(x.nextToken());
        med = Float.parseFloat(x.nextToken());
        criaObjAluno(nom,em,id,sex,niv,med);
    }
    else
    if(criterio == 'p' || criterio == 'P') {
        htrab = Byte.parseByte(x.nextToken());
        criaObjProf(nom,em,id,sex,htrab);
    }
    umaLinha= fr.readLine();
    }
    fr.close();
    } catch(FileNotFoundException fe) {
    System.out.println("Ficheiro nao encontrado");
    }
    catch(NumberFormatException nn){
        System.out.println(nn.getMessage());
    
   
   }
}
    public void criaObjAluno(String n,String e,byte i,char s,byte ni,
    float m) {
        Aluno al = new Aluno();
        al.setNome(n);
        al.setEmail(e);
        al.setIdade(i);
        al.setSexo(s);
        al.setClasse(ni);
        al.setMedia(m);
        v.addElement(al);
    }
    public void criaObjProf(String n,String e,byte i,char s,byte h) {
        Professor pr = new Professor();
        pr.setNome(n);
        pr.setEmail(e);
        pr.setIdade(i);
        pr.setSexo(s);
        pr.setNumHoras(h);
        v.addElement(pr);
    }
    public int getQuantTotal() { 
        return v.size();
    }

    public String toString() {
        String ver = "";
        for (int n = 0; n < v.size(); n++)
        ver += v.elementAt(n).toString();
        return ver;
    }
    public String listaProf() { 
    String ver = ""; 
    Pessoa h; 
    Professor p;
    for (int n = 0; n < v.size(); n++) {
    h = (Pessoa)v.elementAt(n);
    if(h instanceof Professor) {
    p = (Professor)h;
    ver += p.toString();
    }
    }
    return ver;
    
}
    
    public float calcMediaHoras () {
    float m=0; int cont=0;
    Pessoa h; Professor p;
    for (int k = 0; k < v.size(); k++) {
    h = (Pessoa)v.elementAt(k);
    if(h instanceof Professor) {
    p = (Professor)h;
    m += p.getNumHoras();
    cont++;
    }
    } return m/cont;
    }
    public String listaAlunos() {
    String s = ""; 
    Pessoa x; Aluno a;
    for (int n = 0; n < v.size(); n++) {
    x = (Pessoa)v.elementAt(n);
    if(x instanceof Aluno) {
    a = (Aluno)x;
    s += a.toString();
    }
}
return s;
}
}