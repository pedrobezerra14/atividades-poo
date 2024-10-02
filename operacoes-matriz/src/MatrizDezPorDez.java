import java.util.Scanner;

public class MatrizDezPorDez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[10][10];

        int maiorValor = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        System.out.println("Informe os 100 valores da matriz:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior valor presente na matriz: " + maiorValor);

        System.out.print("Coluna em que o maior valor está presente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(matriz[i][coluna] + " ");
        }
        System.out.println();

        System.out.print("Linha em que o maior valor está presente: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(matriz[linha][j] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
