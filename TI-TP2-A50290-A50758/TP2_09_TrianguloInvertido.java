import java.util.Scanner;

public class TP2_09_TrianguloInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insere um número inteiro, o número não pode ser negativo ou zero: ");
        int n = scanner.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j=0; j < (i * 2) - 1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

