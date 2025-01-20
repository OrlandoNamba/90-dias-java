import java.util.Scanner;

public class classificadorDeAtletas {
    public static void main(String[] args) {
        // Criar um Scanner de números decimais, para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler o nome do atleta
        System.out.print("Digite o nome do atleta: ");
        String nome = scanner.nextLine();

        // Ler os valores
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular a soma das 3 notas
        double soma = nota1 + nota2 + nota3;

        // Calcular a media das 3 notas
        double media = soma / 3;

        // Classificar o nível do atleta
        String classificacao;

        if (media >= 9) {
            classificacao = "Atleta de Elite";
        } else if (media >= 7 && media <= 8.9) {
            classificacao = "Atleta Avançado";
        } else if (media >= 5 && media <= 6.9) {
            classificacao = "Atleta Intermediário";
        } else {
            classificacao = "Atleta Iniciante";
        }

        // Mostrar resultados
        System.out.printf("Atleta: %s%n",nome);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Classificação: %s%n",classificacao);

        scanner.close();
    }
}