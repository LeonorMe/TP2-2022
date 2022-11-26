import java.util.Random;
import java.util.Scanner;

public class TP2_15_SomaMatrizes {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n=0;
        System.out.print("Insira um número inteiro positivo não nulo:");
        n = scanner.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        System.out.println("Matriz a: ");
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                a[i][j] = rand.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz b: ");
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                b[i][j] = rand.nextInt(10);
                System.out.print(b[i][j] + ", ");
            }
            System.out.println();
        }

        //SOMA de MATRIZES
        System.out.println("Matriz da soma: ");
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

