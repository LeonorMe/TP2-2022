import java.util.Random;
import java.util.Scanner;

public class TP2_11_RandomArray {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int n=0, sum=0;
        System.out.print("Insira um número inteiro positivo não nulo:");
        n = scanner.nextInt();
        int array[] = new int[n];

        System.out.println("Os elementos escolhidos para o array["+n+"] foram: " );

        for(int i=0; i<n; i++){
            array[i] = rand.nextInt(101);
            System.out.println(i + ": " + array[i]);
            sum += array[i];
        }
        System.out.println("A soma dos elementos: " + sum);
    }
}

