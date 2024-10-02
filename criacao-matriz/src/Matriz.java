import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][10];

        System.out.println("Informe os 50 números que serão adicionados à matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("De 1 a 9, qual é o número da coluna que você quer somar? ");
        int escolha = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][escolha];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
