import java.util.Scanner;

public class TP2_03_Votar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        int anoNascimento, anoAtual = 2022, idade;
        System.out.println("Em que ano nasceu?");
        anoNascimento = scanner.nextInt();
        idade = anoAtual - anoNascimento;

        System.out.println("Nasceu em " + anoNascimento + " e tem " + idade + " anos");
        if(idade >= 18) {
            System.out.println("O/A " + nome + " pode votar.");
        }
        else{
            System.out.println("O/A "+ nome + " não pode votar.");
        }
    }
}

