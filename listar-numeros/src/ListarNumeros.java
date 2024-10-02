import java.util.Scanner;

public class ListarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pares = new int[30];
        int[] impares = new int[30];

        int contadorP = 0;
        int contadorI = 0;

        System.out.println("Informe os 30 números desejados: ");
        for (int i = 0; i < 30; i++) {
            int numeroEntrada = scanner.nextInt();

            if (numeroEntrada % 2 == 0) {
                pares[contadorP] = numeroEntrada;
                contadorP++;
            } else {
                impares[contadorI] = numeroEntrada;
                contadorI++;
            }
        }

        System.out.print("Lista de números pares: ");
        for (int i = 0; i < contadorP; i++) {
            System.out.print(pares[i] + " - ");
        }

        System.out.println();

        System.out.print("Lista de números ímpares: ");
        for (int i = 0; i < contadorI; i++) {
            System.out.print(impares[i] + " - ");
        }
        
        scanner.close();
    }
}
