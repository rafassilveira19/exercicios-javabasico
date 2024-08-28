package exercicioWhile3;

import java.util.Scanner;

public class exercicioWhile3 {

public static void main(String[] args) throws Exception {
        
        //Escreva um programa que continue lendo números inteiros até que o usuário digite 0. 
        //Quando 0 for digitado, o programa deve imprimir a soma dos números lidos.          
        
            int i = -1;
            int soma = 0;
            Scanner scanner = new Scanner (System.in); 

            while (i != 0 ){
                
                System.out.println("Insira um número");
                    i = scanner.nextInt();
                
                    if (i !=0 ) {
                soma += i;
                    }
      }
      System.out.println(soma);
      
      scanner.close();
    }
        }
    