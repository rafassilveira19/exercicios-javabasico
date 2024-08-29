import java.util.Scanner;

public class calculaMediaVariosValores {
    public static void main(String[] args) throws Exception {

        // Desenvolva um algoritmo em Java que leia uma quantidade indefinida de notas de alunos 
        //até que o usuário digite -1. O programa deve calcular e imprimir a média das notas, a 
        // quantidade de alunos que participaram e a nota mais alta. Utilize uma estrutura de 
        // repetição para permitir a leitura das notas.

    
        double nota = 0;
        double somaNotas = 0;
        double media = 0;
        int contador = -1;
        double notaMaisAlta = 0; 

        Scanner scanner = new Scanner(System.in); 

        while ( nota > -1) {

      

        System.out.println("Qual é a nota do aluno?");
        nota = scanner.nextDouble();

        somaNotas += nota;
        contador++;

        if (nota > notaMaisAlta) {
          notaMaisAlta = nota; 
      }
      

        }
      
        
      
        if (contador > 0) { 
         
          media = (somaNotas + 1) / (contador);
          System.out.println("Média das notas: " + media);
          System.out.println("Quantidade de alunos: " + contador);
          System.out.println("Nota mais alta: " + notaMaisAlta);
      } else {
          System.out.println("Nenhuma nota foi inserida.");
      }
        
        scanner.close();
    }

}
