import java.util.Scanner;

public class TP2_01_Idade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int yearBirth, finalAge, yearNow = 2022;

        System.out.println("Em que ano nasceu? ");
        yearBirth = scanner.nextInt();

        finalAge = yearNow - yearBirth;

        System.out.println("Nasceu em " + yearBirth + " e em " + yearNow + " tem " + finalAge + " anos!");
    }
}
