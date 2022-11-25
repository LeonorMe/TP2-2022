import java.util.Scanner;

public class TP2_14_SomaElementos {
    public static void main(String[] args) {
        int a[] = new int[]{1, 1, 2, 3, 4, 6, 6};
        int n = a.length;

        System.out.print("Insira um número inteiro positivo não nulo:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("As possíveis soluções são:");
        int num1=0, num2=0;
        for (int i:a) {
            for (int j = i+1; j < n; j++) {
                if (i+j == num){
                    num1 = i;
                    num2 = j;
                    System.out.println( num1 + ", " + num2);
                }
            }
        }
    }
}

