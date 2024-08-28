package exercicioWhile4;

import java.util.Scanner;

public class exercicioWhile4 {
    public static void main(String[] args) throws Exception {
        
        //Escreva um programa que imprima todos os números ímpares de 1 a 20 usando um loop while.      
        
            int i = 0;
            Scanner scanner = new Scanner (System.in); 

      while (i < 20) {

        i++;

        if (i % 2 == 1) {

            System.out.println(i);
        }

      }

      scanner.close();
    }
        }

