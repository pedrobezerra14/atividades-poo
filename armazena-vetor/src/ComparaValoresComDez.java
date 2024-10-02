import java.util.Scanner;

public class ComparaValoresComDez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[100];

        System.out.println("Informe os 100 valores que deseja para verificar:");
        for (int i = 0; i < 100; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Valores informados que são menores ou iguais a 10:");
        for (int i = 0; i < 100; i++) {
            if (vetor[i] <= 10) {
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
    }
}
