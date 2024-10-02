import java.util.Scanner;

public class ChecarMultiplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");

        int primeiroNumero = scanner.nextInt();

        System.out.print("Informe o segundo número: ");

        int segundoNumero = scanner.nextInt();

        if (segundoNumero % primeiroNumero == 0) {
            System.out.println("Os números são múltiplos!");
        } else {
            System.out.println("Os números não são múltiplos!");
        }
        scanner.close();
    }
}
