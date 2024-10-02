import java.util.Scanner;

public class RetornaMaiorValor {

    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe qual será o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Informe os valores que vão ser usados para preencher o vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int maior = maiorValor(vetor);
        System.out.println("Maior valor: " + maior);

        scanner.close();
    }
}
