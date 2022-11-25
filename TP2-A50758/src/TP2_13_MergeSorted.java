import java.util.Random;
import java.util.Scanner;

public class TP2_13_MergeSorted {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 2, 5, 7};// n
        int[] b = new int[]{2, 3, 4, 8, 9}; // m
        int lena=a.length, lenb=b.length;
        int[] resposta = new int[lena+lenb]; // m+n

        int ai = 0, bi=0; // indice do array a; indice do array b

        for(int i=0; i<lena+lenb; i++) {
            if (ai >= lena || (a[ai] > b[bi] && ai<lena && bi<lenb)) {
                resposta[i] = b[bi];
                bi++;
            } else if (bi >= lenb || (a[ai] <= b[bi] && ai<lena && bi<lenb)) {
                resposta[i] = a[ai];
                ai++;
            }

            // Alternativa mais legivel
            /*
            if (ai >= lena) {
                resposta[i] = b[bi];
                bi++;
            } else if (bi >= lenb) {
                resposta[i] = a[ai];
                ai++;
            } else if (a[ai] > b[bi]) {
                resposta[i] = b[bi];
                bi++;
            } else {
                resposta[i] = a[ai];
                ai++;
            }*/
        }
        for(int i: c){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }
}
