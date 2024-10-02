import java.util.Scanner;

public class LeituraMatriz {

    public static void preencherMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Informe os números que serão inseridos na matriz: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static int[][] matrizTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[linhas][colunas];

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                transposta[linha][coluna] = matriz[linha][coluna];
            }
        }
        return transposta;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int num : linha) {
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Linhas: ");
        int linhas = scanner.nextInt();
        
        System.out.print("Colunas: ");
        int colunas = scanner.nextInt();
        
        int[][] matriz = new int[linhas][colunas];
        
        preencherMatriz(matriz);

        System.out.println("------------------------------");
        System.out.println("1 Matriz:");

        mostrarMatriz(matriz);
        System.out.println("------------------------------");
        
        int[][] matrizTransposta = matrizTransposta(matriz);

        System.out.println("-----------------------------");
        System.out.println("2 Matriz transposta:");

        mostrarMatriz(matrizTransposta);
        System.out.println("------------------------------");

        scanner.close();
    }
}
