import java.util.Scanner;

public class ManipularVetor {

    public static void lerVetor(int[] numeros) {
        Scanner scanner = new Scanner(System.in);

        for (int posicao = 0; posicao < numeros.length; posicao++) {
            System.out.print("Informe o número: ");
            numeros[posicao] = scanner.nextInt();
        }

        scanner.close();
    }

    public static int funcaoSomarPares(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                soma += num;
            }
        }
        return soma;
    }

    public static void funcaoImprimirVetor(int[] numeros) {

        for (int num : numeros) {
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de números que você irá inserir -> ");
        int qtdNumeros = scanner.nextInt();
        
        int[] numeros = new int[qtdNumeros];
        
        lerVetor(numeros);
        funcaoImprimirVetor(numeros);
        
        int somaPares = funcaoSomarPares(numeros);

        System.out.println("Resultado da soma dos pares: " + somaPares);


        scanner.close();
    }
}
