/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerirvestidos;

/**
 *
 * @author Taimo
 */
import java.text.DecimalFormat;
import java.io.*;
public class GerirVestidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       
        ArryVestidos arev= new ArryVestidos();
        DecimalFormat m = new DecimalFormat ("###,###.00 Mt");
        arev.lerFichCriarArray();
        System.out.println("Dados do fich txt e armazenados no array: ");
        System.out.println(arev); 
        System.out.println("Total =" + m.format(arev.calcTotGlobal()));
        arev.gravarFichTxt("Out.txt");

    }
    
}
