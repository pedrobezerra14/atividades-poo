import java.util.Scanner;

public class ValoresRepetidos {

    public static boolean repetidos(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println(repetidos(vetor));

        scanner.close();
    }
}
