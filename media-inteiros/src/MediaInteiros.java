import java.util.Scanner;

public class MediaInteiros {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int armazenaValores;

        for(int i = 1; i <= 20; i++){
            System.out.println("Digite os valores que deseja 20x: ");
            System.out.println("Essa é a " + i + "ª vez");
            armazenaValores = scanner.nextInt();
            soma+= armazenaValores;
        }
        double media = soma / 20;

        System.out.println("A média é: " + media);
        scanner.close();
    }
}
