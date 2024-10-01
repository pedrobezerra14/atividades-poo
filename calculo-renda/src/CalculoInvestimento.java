public class CalculoInvestimento {
    public static void main(String[] args){
        double dinheiroJoao = 1000.00;
        double dinheiroMaria = 100.00;
        
        double ganhoJoao = 0.005;
        double ganhoMaria = 0.01;
        
        int mes = 0;

        while (dinheiroMaria <= dinheiroJoao) {
            dinheiroJoao += dinheiroJoao * ganhoJoao;
            dinheiroMaria += dinheiroMaria * ganhoMaria;
            
            mes++;
        }
        
        System.out.println("Maria vai ter mais dinheiro que João depois de " + mes + " meses");
    }
}
