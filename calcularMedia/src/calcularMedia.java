public class calcularMedia {
    public static void main(String[] args) throws Exception {

// Fazer um programa que imprima a média aritmética dos números 8,9 e 7. 
//A média dos números 4, 5 e 6. A soma das duas médias. A média das médias


double primeiraMedia = (8.9 + 7) / 2;
double segundaMedia = (4 + 5 + 6) / 3;
double somaMedia = primeiraMedia + segundaMedia;
double terceiraMedia = somaMedia / 2;

        System.out.println("A média aritimetica de 8,9 e 7 é: " + primeiraMedia);
        System.out.println("A média aritimetica de 4, 5 e 6 é: " + segundaMedia);
        System.out.println("A soma das médias aritimeticas é de " + somaMedia);
        System.out.println("A média aritimetica de " + primeiraMedia + " e "  + segundaMedia + " é: " + terceiraMedia);


    }
}
