import java.util.Random;
import java.util.Scanner;

public class TP2_14_SomaElementos {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n=0, m=0;

        n = rand.nextInt(101); m = rand.nextInt(101);
        int a[] = new int[n];
        int b[] = new int[m];

        System.out.println("Array a: ");
        for(int i=0; i<n; i++){
            a[i] = rand.nextInt(101);
            System.out.print(a[i] + ", ");
        }
        System.out.println();

        System.out.println("Array b: ");
        for(int i=0; i<m; i++){
            b[i] = rand.nextInt(101);
            System.out.print(b[i] + ", ");
        }
        System.out.println();

        System.out.print("Insira um número inteiro positivo não nulo):");
        int num = scanner.nextInt();
        boolean existe = false;
        int num1=0, num2=0;
        for (int i:a) {
            for (int j:b) {
                if (i+j == num){
                    num1 = i;
                    num2 = j;
                    existe = true;
                    break;
                }
            }

        }
        if(existe){
            System.out.println("Existem 2 números que dão a soma desejada: " + num1 + " e " + num2);
        }else {
            System.out.println("Não extistem e números nos arrays cuja soma dê o número: " + num);
        }
    }
}

