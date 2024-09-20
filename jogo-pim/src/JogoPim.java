public class JogoPim {
    public void jogar(){
        for(int i=1; i <= 50; i++) {
            if (i % 4 == 0 ) {
                System.out.println("PIM");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void iniciarJogo(){
        JogoPim jogo = new JogoPim();
        jogo.jogar();
    }

    public static void main(String[] args) {
        iniciarJogo();
    }
}
