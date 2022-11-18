import java.util.Scanner;
import static java.lang.Math.abs;

public class TP2_10_Divisao {
    public static void main(String[] args) {
        int divisor, dividendo, quociente, resto;
        System.out.print("Insira o divisor (número inteiro positivo não nulo):");
        Scanner scanner = new Scanner(System.in);
        divisor = scanner.nextInt();
        while (divisor != abs(divisor) || divisor == 0){
            if(divisor == 0){
                System.out.println("Erro: o valor inserido é 0. Não é possível dividir por 0. Insere um número inteiro positivo diferente de 0.");
                divisor = scanner.nextInt();
            }
            else if(divisor != abs(divisor)){
                System.out.println("Erro: o valor inserido é negativo, por favor insere um número > 0.");
                divisor = scanner.nextInt();
            }
        }
        System.out.println("O valor inserido foi aceite.");

        System.out.print("Insira o divisor (número inteiro positivo):");
        dividendo = scanner.nextInt();
        while (dividendo != abs(dividendo)){
            System.out.println("Erro: o valor inserido é negativo, por favor insere um número inteiro positivo.");
            dividendo = scanner.nextInt();
        }
        System.out.println("O valor inserido foi aceite.");

        quociente = 0;
        resto = dividendo;

        while (resto >= divisor){
            resto -= divisor;
            quociente++;
        }
        System.out.println("O quociente da divisão de " + dividendo + " por " + divisor + " é " + quociente + " e o resto da divisão é " + resto + " .");
    }
}
