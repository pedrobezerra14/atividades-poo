import java.util.Scanner;

public class VerificaPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele é primo: ");
        int numero = scanner.nextInt();

        boolean primo = true;

        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " é tio");
        }

        scanner.close();
    }
}
