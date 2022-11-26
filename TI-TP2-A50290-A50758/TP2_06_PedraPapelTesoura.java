import java.util.Random;
import java.util.Scanner;

public class TP2_06_PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Jogo Pedra Papel Tesoura");
        int jogadaPC = rand.nextInt(3);

        System.out.println("Insere a tua jogada: Pedra, Papel ou Tesoura: ");
        String jogadaUt = scanner.nextLine();
        int jogadaUtilizador=3;
        if(jogadaUt.equals("Pedra")){
            jogadaUtilizador = 0;
        } else if (jogadaUt.equals("Papel")) {
            jogadaUtilizador = 1;
        } else if (jogadaUt.equals("Tesoura")) {
            jogadaUtilizador = 2;
        }else{
            System.out.println("Jogada invalida");
            return;
        }

        String[] jogadaPCString = {"Pedra", "Papel", "Tesoura"};

        System.out.println("Jogaste " + jogadaUt);
        System.out.println("Eu jogo " + jogadaPCString[jogadaPC]);

        if((jogadaPC == 2 && jogadaUtilizador == 1) || (jogadaPC == 0 && jogadaUtilizador == 2) || (jogadaPC == 1 && jogadaUtilizador == 0) ){
            System.out.println("Ganhei.");
        }
        else {
            if((jogadaUtilizador == 2 && jogadaPC == 1) || (jogadaUtilizador == 0 && jogadaPC == 2) || (jogadaUtilizador == 1 && jogadaPC == 0)){
                System.out.println("Ganhas-te!");
            }
            else{
                System.out.println("É um empate");
            }
        }
        System.out.println("Bom jogo");
    }
}
