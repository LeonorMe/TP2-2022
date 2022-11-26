import java.util.Scanner; import java.util.stream.IntStream;
public class TP2_07_ListaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dois números:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira uma das seguintes opções: par, impar, todos");
        String opcao = scanner.nextLine();

        if(n1 > n2){ int n3 = n2; n2 = n1; n1 = n3;}
        if(opcao.equals("par")){
            if(n1%2 != 0){ n1 += 1;}
            int[] array = IntStream.range(n1, n2+1).toArray();
            for (int i=0; i < array.length; i += 2) {
                System.out.println(array[i]);
            }
        }else if(opcao.equals("impar")){
            if(n1%2 == 0){ n1 += 1;}
            int[] array = IntStream.range(n1, n2+1).toArray();
            for (int i=0; i < array.length; i += 2) {
                System.out.println(array[i]);
            }
        } else if (opcao.equals("todos")) {
            int[] array = IntStream.range(n1, n2+1).toArray();
            for (int i=0; i < array.length; i += 1) {
                System.out.println(array[i]);
            }
        }
        /* Outra resolução do exercício
        System.out.println("Introduza o valor do 1o número: ");
        int num1 = input.nextInt();

        System.out.println("Introduza o valor do 2o número: ");
        int num2 = input.nextInt();

        if(num1>num2)  {int aux = num1; num1 = num2; num2 = aux;}

        System.out.println("Insira uma destas palavras {“par”, “impar”, “todos”}: ");
        String word = input.next();

        word = word.toLowerCase().replace("\\s", "");

        boolean valido = (word.equals("par") || word.equals("impar") || word.equals("todos")) ? true:false;

        if(valido) {
            System.out.print("Listagem de números entre os introduzidos " + num1 + " - " + num2 + ": ");
            for (int i = num1; i <= num2; i++) {
                if (word.equals("par")) {
                    if (i % 2 == 0) {

                        System.out.print(i + " ");
                    }
                } else if (word.equals("impar")) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                } else {
                    System.out.print(i + " ");
                }
            }
        } else System.out.println("Palavra não valida! ");
        */
    }
}
