/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerirvestidos;
import java.util.StringTokenizer; 
import java.io.*;

/**
 *
 * @author Taimo
 */
public class ArryVestidos {
    
    private Vestido[] lista;
    private int cont;
    
    public ArryVestidos(){
        lista = new Vestido[100];
        cont=0;
    }
    public void lerFichCriarArray() {
    StringTokenizer umaCadeia;
    String umaLinha="", nom, nomeFich = "vestidos.txt"; 
          int qde; 
          float pr;
    try { FileReader fr = new FileReader(nomeFich);
    BufferedReader fichIn = new BufferedReader(fr);
    umaLinha = fichIn.readLine();
    while (umaLinha != null) {
    umaCadeia = new StringTokenizer(umaLinha,";");
    nom = umaCadeia.nextToken();
    qde = Integer.parseInt(umaCadeia.nextToken());
    pr = Float.parseFloat(umaCadeia.nextToken());
    lista[cont] = new Vestido(nom,qde,pr);
    cont++;
    umaLinha = fichIn.readLine();
    }
    fichIn.close();
    }catch (FileNotFoundException fn){
        System.out.println(" Ficheiro nao encontrado!");
    }catch (NumberFormatException nn){
        System.out.println(nn.getMessage());
    }catch (IOException ex){ 
        System.out.println(ex.getMessage());
    } 
    }
    
    public float calcTotGlobal() {
        float som = 0;
        for (int j = 0; j < cont; j++)
        som += lista[j].getTotal();
        return som;
    }
    public String toString() {
        String x = "";
        for (int a = 0; a < cont; a++)
        x += lista[a] + "\n"; //.toString() opcional
        return x;
    }
    public void gravarFichTxt(String nf) throws IOException {
        try{ 
            FileWriter fw = new FileWriter(nf);
        BufferedWriter fichOut = new BufferedWriter(fw);
        for (int k = 0; k < cont; k++) {
            fichOut.write(lista[k].getNome()+";"+lista[k].getTotal());
            fichOut.newLine();
        }
        fichOut.close();
        } catch (IOException xx) { System.out.println(xx.getMessage());

    }
}
        }