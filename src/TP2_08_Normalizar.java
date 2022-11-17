import java.util.Arrays;
import java.util.Scanner;

public class TP2_08_Normalizar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome completo.");
        String nomeInteiro = scanner.nextLine();

        String[] nomes = nomeInteiro.split("\\s+/");
        String[] excluir = {"do", "da", "dos", "das", "e", "a", "o"};

        for(String nome: nomes ){
            if(Arrays.asList(excluir).contains(nome)){
                // se tiver M -> m
                for(int i=0;  i<nome.length(); i++){
                    int letraCode = nome.charAt(i);
                    if(letraCode < 97){
                        //nome.charAt(i) = (char)(letraCode + 32);
                        System.out.print((char)(letraCode + 32));
                    }else{
                        System.out.print(nome.charAt(i));
                    }
                }
            }
            else{ // é um nome normal, a primeira tem de ser M
                for(int i=0;  i<nome.length(); i++) {
                    char letra = nome.charAt(i);
                    int letraCode = letra;

                    if (i==0 && letraCode >= 97) { // se 1º for m -> M
                        letra = (char)(letraCode - 32);
                    }
                    else if(letraCode < 97){
                            letra = (char)(letraCode + 32);
                    }
                    //nome.charAt(i) = letra;
                    System.out.print(letra);
                }

            }
            System.out.print(" ");
        }

    }
}
