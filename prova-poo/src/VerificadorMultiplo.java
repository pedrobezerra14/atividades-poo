import java.util.Scanner;

public class VerificadorMultiplo {

    public static boolean verificacao(int num) {
        if (num % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se ele é(ou não) múltiplo de 4: ");
        int entrada = scanner.nextInt();

        boolean verificado = verificacao(entrada);

        if (verificado) {
            System.out.println(entrada + " é múltiplo");
        } else {
            System.out.println(entrada + " não é múltiplo");
        }
        scanner.close();
    }
}
