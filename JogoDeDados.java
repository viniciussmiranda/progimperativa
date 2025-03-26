import java.util.Random;

public class JogoDeDados {
    public static void main(String[] args) {
        Random random = new Random();

        int pontosJogador1 = 0;
        int pontosJogador2 = 0;

        for (int i = 0; i < 10; i++) {
            int dadoJogador1 = random.nextInt (6) + 1;
            int dadoJogador2 = random.nextInt (6) + 1;
        
            if (dadoJogador1 > dadoJogador2) {
                pontosJogador1++;    
         } else if (dadoJogador2 > dadoJogador1) {
            pontosJogador2++;
         }

         System.out.println("Rodada " + (i+1) + ": Jogador 1 = " + dadoJogador1 + ", Jogador 2 = " + dadoJogador2);

     }
         System.out.println("Pontuação final: Jogador 1 = " + pontosJogador1 + ", Jogador 2 = " + pontosJogador2);

         if (pontosJogador1 > pontosJogador2) {
            System.out.println("Jogador 1 venceu!");
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("Jogador 2 venceu!");
        } else {
            System.out.println("Deu empate!");
        }
    }
}