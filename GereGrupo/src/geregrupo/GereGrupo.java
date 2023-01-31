/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geregrupo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**Utilizacao de heranca
 *
 * @author Taimo
 */
public class GereGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
       
        Tarefas t = new Tarefas();
        int op = 0;
        do {
        System.out.println("Ler Ficheiro");
        System.out.println("Ver ficheiro");
        System.out.println("Media das horas dos professores");
        System.out.println("lista Alunos");
        op = Integer.parseInt(a.readLine());
        switch(op){
        case 1: t.lerFichTxt(); break;
        case 2: System.out.println(t.toString()); break;
        case 3: System.out.println("Media horas dos prof="+
        t.calcMediaHoras()); break;
        case 4: System.out.println(t.listaAlunos()); break;
        default : System.out.println("Opcao invalida!"); break;
        
        }
        } while(op!=5);
            }

        }
