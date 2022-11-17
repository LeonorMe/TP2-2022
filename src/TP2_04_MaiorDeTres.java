import java.util.Scanner;

public class TP2_04_MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Insira 3 números");
        n1 = scanner.nextInt(); n2 = scanner.nextInt(); n3 = scanner.nextInt();

        double menor, medio, maior;
        if(n1 > n2){
            if(n1 >n3){
                maior = n1;
                if(n2 > n3){
                    medio = n2; menor = n3;}
                else{
                    medio = n3; menor = n2;}}
            else{
                maior = n3; medio = n1; menor = n2;}}
        else{
            if(n2 > n3){ maior = n2;
                if(n1 > n3){ medio = n1; menor = n3;}
                else { medio = n3; menor = n1;}}
            else{ maior = n3; medio = n2; menor = n1;}}

        System.out.println("Os numeros inseridos foram: " + n1 + ", " + n2 + " e " + n3 +
                ". Por ordem crescente ficam: " + menor + " < " + medio + " < " + maior);}
}

