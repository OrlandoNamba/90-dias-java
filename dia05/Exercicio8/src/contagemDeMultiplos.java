import java.util.Scanner;

public class contagemDeMultiplos {
    public static void main(String[] args) {
        // Criar scanner
        Scanner scanner = new Scanner(System.in);

        // Ler o número fornecido pelo usuário
        System.out.print("Digite um número positivo que deseja dividir: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o número divisor: ");
        int divisor = scanner.nextInt();

        // Validar se os números são positivos
        if (numero < 0 || divisor <= 0) {
            System.out.println("Ambos os números devem ser positivos e o divisor deve ser maior que zero! O programa será encerrado.");
            return;
        }

        // Criar a variável para contar múltiplos
        int divisores = 0;
        StringBuilder numerosEncontrados = new StringBuilder();

        // Calcular o número de múltiplos e armazenar os valores encontrados
        for (int i = 1; i <= numero; i++) {
            if (i % divisor == 0) { // verifica múltiplos do divisor informado
                divisores++;
                if (!numerosEncontrados.isEmpty()) {
                    numerosEncontrados.append(", ");
                }
                numerosEncontrados.append(i);
            }
        }

        // Exibir resultados
        System.out.println("A quantidade de números múltiplos de " + divisor + " entre 1 e " + numero + " é: " + divisores);
        System.out.println("Números encontrados: " + numerosEncontrados.toString());

        // Fechar scanner
        scanner.close();
    }
}
