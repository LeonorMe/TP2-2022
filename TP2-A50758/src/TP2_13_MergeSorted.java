import java.util.Random;
import java.util.Scanner;

public class TP2_13_MergeSorted {
/*
    int mix(int a, int b){
        int c[];
        while (a.length>0 && b.length>0){
            if (a[0]>b[0]){
                c.push(b[0]);
                b.erease(b[0]);
            }
            else{
                c.push(a[0]);
                a.erease(a[0]);
            }
        }
        while (a.length > 0) {
            c.push(a[0]);
            a.erease(a[0]);

        }
        while (a.length > 0) {
            c.push(b[0]);
            b.erease(b[0]);
        }
        return c;
    }

    int mergesort(int a, int n){
        if(n==1){
            return a;
        }
        //int l1 = a[0]...a[n/2];
        //int l2 a[n/2]...a[n];

        l1 = mergesort(l1);
        l2 = mergesort(l2);

        return mix(l1, l2);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n=0, m=0;
        System.out.print("Insira um número inteiro positivo não nulo):");
        n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        System.out.println("Array original: ");
        for(int i=0; i<n; i++){
            a[i] = rand.nextInt(101);
            System.out.print(a[i] + ", ");
        }
        System.out.println();

        //MergeSort
        mergesort(a);
    } */
}
