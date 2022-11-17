import java.util.Random;
import java.util.Scanner;

public class TP2_06_PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Jogo Pedra Papel Tesoura");

        String[] jogadas = {"Pedra", "Papel", "Tesoura"};
        String jogadaPC = jogadas[rand.nextInt(3)];

        System.out.println("Insere a tua jogada: Pedra, Papel ou Tesoura.");

        String jogadaUtilizador = scanner.nextLine();
        System.out.println("Jogaste " + jogadaUtilizador);
        System.out.println("Eu jogo " + jogadaPC);

        if((jogadaPC == "Tesoura" && jogadaUtilizador == "Papel") ||
            (jogadaPC == "Pedra" && jogadaUtilizador == "Tesoura") ||
                (jogadaPC == "Papel" && jogadaUtilizador == "Pedra") ){
            System.out.println("Ganhei.");
        }
        else {
            if((jogadaUtilizador == "Tesoura" && jogadaPC == "Papel") ||
                    (jogadaUtilizador == "Pedra" && jogadaPC == "Tesoura") ||
                    (jogadaUtilizador == "Papel" && jogadaPC == "Pedra")){
                System.out.println("Ganhas-te!");
            }
            else{
                System.out.println("É um empate");
            }
        }
        System.out.println("Bom jogo");
    }
}
