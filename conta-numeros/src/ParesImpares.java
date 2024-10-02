import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        System.out.print("Informe a quantidade de números que deseja: ");

        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Insira o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;

            } else {
                impares++;

            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        scanner.close();
    }
}
