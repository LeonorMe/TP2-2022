import java.util.Scanner;
import java.lang.Math;

public class TP2_02_FormulaResolvente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.println("ax^2 + bx + c = 0: ");
        System.out.println("Introduza o valor de 'a': ");
        a = scanner.nextInt();
        System.out.println("Introduza o valor de 'b': ");
        b = scanner.nextInt();
        System.out.println("Introduza o valor de 'c': ");
        c = scanner.nextInt();

        double delta, firstX=0, secX=0;
        String dResult="";

        delta = (b * b) - (4.0 * a * c);
        if(delta < 0){ // nao tem soluçao
            System.out.println("Não ha soluções para os numeros " + a + ", " + b + " e " + c);
        }
        else {
            if (delta > 0) { // duas soluções
                dResult = ">";
                secX = (-b + Math.sqrt(delta)) / (2 * a);
                firstX = (-b - Math.sqrt(delta)) / (2 * a);
            }
            else { // uma solução
                dResult = "=";
                firstX = secX = -b / (2 * a);
            }
            System.out.println("A solução de " + a + "x² + " + b + "x + " + c + " = 0" + " é: " +
                    "\n x1 = " + String.format("%.3g%n", firstX) + " x2 = " + String.format("%.3g%n", secX) +
                    "\no delta ((b² - (4.0 * a * c))) é " + dResult + " 0");
        }
    }
}

