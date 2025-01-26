import java.util.Scanner;

public class somaDeMultiplos {
    public static void main(String[] args) {
        // Cria o scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê o número base e o divisor
        System.out.print("Digite um número base positivo: ");
        int numeroBase = scanner.nextInt();

        System.out.print("Digite um número divisor positivo: ");
        int divisor = scanner.nextInt();

        // Valida se os números são positivos
        if (numeroBase <= 0 || divisor <= 0) {
            System.out.println("Ambos os números devem ser positivos! O programa será encerrado.");
            return;
        }

        // Variáveis para armazenar soma e lista de múltiplos
        int soma = 0;
        StringBuilder multiplos = new StringBuilder();

        // Percorre os números de 1 até o número base
        for (int i = 1; i <= numeroBase; i++) {
            if (i % divisor == 0) {
                soma += i; // Somar os múltiplos
                multiplos.append(i).append(", "); // Adicionar à lista de múltiplos
            }
        }

        // Remove a última vírgula e espaço da string de múltiplos
        if (!multiplos.isEmpty()) {
            multiplos.setLength(multiplos.length() - 2);
        }

        // Exibe os múltiplos e a soma
        System.out.println("Os múltiplos de " + divisor + " entre 1 e " + numeroBase + " são: " + multiplos);
        System.out.println("A soma dos múltiplos é: " + soma);

        // Fechar scanner
        scanner.close();
    }
}
