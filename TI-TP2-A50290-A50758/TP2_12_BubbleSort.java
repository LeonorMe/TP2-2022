import java.util.Random;
import java.util.Scanner;

public class TP2_12_BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n=0;
        System.out.print("Insira um número inteiro positivo não nulo:");
        n = scanner.nextInt();
        int array[] = new int[n];

        System.out.println("Array original: ");
        for(int i=0; i<n; i++){
            array[i] = rand.nextInt(101);
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        // ordenar por ordem crescente
        boolean trocado;
        int temp;
        do{
           trocado = false;
           for (int i=0; i<n-1; i++) {
               if(array[i] > array[i+1]){
                   temp = array[i];
                   array[i] = array[i+1];
                   array[i+1] = temp;

                   trocado = true;
               }
           }
        }while(trocado);

        System.out.println("Array ordenado: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}

