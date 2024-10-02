import java.util.Scanner;

public class ConverterTemperaturas {

    public static double conversorFahrenheit(double entradaTemperatura) {
        return (entradaTemperatura * 1.8) + 32;
    }

    public static double conversorKelvin(double entradaTemperatura) {
        return entradaTemperatura + 273;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura que você quer converter: ");
        double entradaTemperatura = scanner.nextDouble();

        System.out.println("Escolha para qual medida você deseja converter -> ");

        System.out.println("F = Fahrenheit ||| K = Kelvin");
        char escolha = scanner.next().charAt(0);

        switch (escolha) {
            case 'F':
                System.out.println(conversorFahrenheit(entradaTemperatura) + "F");
                break;

            case 'K':
                System.out.println(conversorKelvin(entradaTemperatura) + "K");
                break;
        }
        scanner.close();
    }
}
