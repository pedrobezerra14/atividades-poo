import java.util.Scanner;

public class PreencherVetor {

    public static void preencherVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores para preencher o vetor:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Criando o vetor com o tamanho escolhido pelo usuário
        int[] vetor = new int[tamanho];

        // Chamando a função para preencher o vetor
        preencherVetor(vetor);

        // Exibindo o vetor preenchido
        System.out.println("Vetor preenchido:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }
}
