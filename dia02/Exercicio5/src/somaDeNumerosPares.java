import java.util.Scanner;

public class somaDeNumerosPares {
    public static void main(String[] args) {
        // Criar um scannerde números inteiros
        Scanner scanner = new Scanner(System.in);

        // Ler o número digitado pelo usuário
        System.out.print("Digite um número inteiro e positivo: ");
        int numero = scanner.nextInt();

        // Permitir apenas números positivos
        if (numero >= 0) {
        } else {
            System.out.print("O número deve ser positivo! O programa será encerrado.");
            return;
        }

        // Variável para armazenar a soma
        int soma = 0;

        // Calcular a soma dos números pares de 1 até o número informado
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) { //Verificação para ver se o número é par
                soma += i; // Soma o número par
            }
        }

        // Exibir a soma
        System.out.println("A soma dos números pares de 1 até " + numero + " é: " + soma);

        // Fechar o scanner
        scanner.close();
    }
}