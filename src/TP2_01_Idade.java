import java.util.Scanner;

public class TP2_01_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoNascimento, anoAtual = 2022, idade;
        System.out.println("Em que ano nasceu?");
        anoNascimento = scanner.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.println("Nasceu em " + anoNascimento + " e em " + anoAtual + " tem " + idade + " anos!");
    }
}
