import java.util.Scanner;

public class CompletarVetor {

    public static void completarVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os valores do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho que o vetor irá ter: ");

        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        completarVetor(vetor);

        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }
}
