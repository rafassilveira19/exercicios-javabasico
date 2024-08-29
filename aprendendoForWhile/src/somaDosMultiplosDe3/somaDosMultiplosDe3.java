package somaDosMultiplosDe3;

public class somaDosMultiplosDe3 {

    // Crie um programa que some todos os múltiplos de 3 entre 1 e 100, e imprima o resultado.
    public static void main(String[] args) throws Exception {
    int soma = 0;

    for ( int i = 0 ; i <= 100; i++) {

        if ( i % 3 == 0) {
            soma += i;

        }
    
    }

    System.out.println(soma);

}
}
