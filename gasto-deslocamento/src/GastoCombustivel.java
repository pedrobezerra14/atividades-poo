import java.util.Scanner;

public class GastoCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe qual é a distância do deslocamento até a ESPEP (medida utilizada é o Km): ");

        double distancia = scanner.nextDouble();

        System.out.print("Informe qual é o consumo médio do carro (medida utiliada é litros/Km): ");

        double mediaConsumo = scanner.nextDouble();

        System.out.print("Informe qual é o preço do combustível por litro (moeda utilizada é o R$): ");

        double valorCombustivel = scanner.nextDouble();

        System.out.print("Informe a frequência que o professor se desloca por mês: ");
        
        int diasGastos = scanner.nextInt();

        double litrosPorViagem = (distancia * 2) / mediaConsumo;

        double gastoMensal = litrosPorViagem * valorCombustivel * diasGastos;

        System.out.printf("O carro do professor vai gastar %.2f litros de combustível\n", litrosPorViagem);

        System.out.printf("O professor vai gastar R$ %.2f por mês com combustível.\n", gastoMensal);

        scanner.close();
    }
}
