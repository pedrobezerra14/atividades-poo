import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que você irá inserir: ");
        int quantidadeNumeros = scanner.nextInt();

        int somaPares = 0;
        int armazenaNumeros;

        for(int i = 1; i <= quantidadeNumeros; i++) {
            System.out.println("Digite o " + i + "º  número");
            armazenaNumeros = scanner.nextInt();

            if(armazenaNumeros % 2 == 0) {
                somaPares += armazenaNumeros;
            }
        }

        System.out.println("o resultado da soma dos números pares é " + somaPares);
        scanner.close();
    }
}
