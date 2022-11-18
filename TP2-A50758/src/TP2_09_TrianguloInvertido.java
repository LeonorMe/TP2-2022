import java.util.Scanner;

public class TP2_09_TrianguloInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insere um número inteiro: ");
        int n = scanner.nextInt();

        for(int i = n; i>0; i--){
            int j=0;
            for(j = (n-i); j > 0; j--){ // 1 + 2*(n-i)
                System.out.print(" ");
            }
            for (int k = n*2-1-((n-i)*2); k>0; k--){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

