import java.util.Random;
import java.util.Scanner;

public class TP2_05_Dados {
    public static void main(String[] args) {
        Random rand = new Random();
        int dado = rand.nextInt(6)+1;

        System.out.print("Tenta acertar num número inteiro de 1 a 6: ");
        Scanner scanner = new Scanner(System.in);
        int jogadaUtilizador = scanner.nextInt();

        if(jogadaUtilizador == dado) {
            System.out.println("Acertaste, o número era " + dado);
        }
        else{
            System.out.println("Errado, o número era " + dado + " e jogaste " + jogadaUtilizador);
        }
    }
}

