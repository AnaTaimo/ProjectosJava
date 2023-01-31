/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.round;

/**
 *
 * @author Taimo
 */
public class TrabalhadorCriar {
    
    import java.io.*;
public class Trabalhador
{ //Atributos
private short codigo, idade; 
//Construtor. Recebe valores iniciais dos atributos (codigo e idade)
public Trabalhador()throws IOException
{ System.out.println("Introduza o codigo (1111-9999): ");
codigo = validarShort((short)1111, (short)9999);
System.out.println("Idade (18-65): ");
idade = validarShort((short)18,(short)65);
} 
private short validarShort(short a, short b)throws IOException
{ short c; BufferedReader y =
new BufferedReader(new InputStreamReader(System.in));
do
{ c = Short.parseShort(y.readLine());
if(c<a || c>b)
System.out.println("Valor invalido! Tente de novo");
} while (c<a || c>b);
return c;
}
public short getIdade() { return idade; } //Devolve o valor de idade
//devolve uma linha de informação sobre o trabalhador.
public String toString()
{ return "Codigo\tIdade\n"+codigo+"\t"+idade; }
}
        
}
    
   

