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
    }
}
