import java.util.Scanner;
import java.lang.Math;

public class TP2_02_FormulaResolvente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.println("Insira 3 números");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        double delta = Math.pow(b,2)-(4*a*c);
        if(delta > 0){ // ha duas soluçoes
            double x1 = (-b + Math.sqrt(delta))/(a*2);
            double x2 = (-b - Math.sqrt(delta))/(a*2);
            System.out.println("Com os numeros: " + a + ", " + b + " e " + c +
                    ", as soluções da função quadrática são " + x1 + " e " + x2);
        }
        else if (delta == 0){ // ha uma soluçao
            double x = (-b)/(a*2);
            System.out.println("Com os numeros: " + a + ", " + b + " e " + c +
                    ", a solução da função quadrática é " + x);
        }
        else{ // nao tem soluçao
            System.out.println("Não ha soluções para os numeros " + a + ", " + b + " e " + c);
        }
    }
}
