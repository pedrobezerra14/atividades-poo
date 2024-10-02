import java.util.Scanner;

public class SomaTotalPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAtual = 1;

        int somaPares = 0;
        int ultimoPar = 0;


        while (numeroAtual <= 20) {

            System.out.print("Informe o número desejado -> ");
            int numero = scanner.nextInt();

            if (numero%2==0) {

                somaPares = somaPares + ultimoPar + numero;

                ultimoPar = numero;
            }
            
            numeroAtual++;
        }

        System.out.println("Soma -> " + somaPares);
        scanner.close();
    }
}
