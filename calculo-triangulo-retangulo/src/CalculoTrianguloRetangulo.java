import java.util.Scanner;

public class CalculoTrianguloRetangulo {

    public static boolean TrianguloRetangulo(double hipotenusa, double cateto1, double cateto2) {
        return hipotenusa * hipotenusa == cateto1 * cateto1 + cateto2 * cateto2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hipotenusa = scanner.nextDouble();

        double cateto1 = scanner.nextDouble();
        
        double cateto2 = scanner.nextDouble();

        System.out.println(TrianguloRetangulo(hipotenusa, cateto1, cateto2));

        scanner.close();
    }
}
