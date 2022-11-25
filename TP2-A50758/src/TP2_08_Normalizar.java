import java.util.Arrays;
import java.util.Scanner;

public class TP2_08_Normalizar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome completo.");
        String nomeInteiro = scanner.nextLine();
        char letra;
        int letraCode;

        String[] excluir = {"do", "da", "de", "dos", "das", "des", "e", "a", "o"};
        char[] normal = nomeInteiro.toCharArray();

        // por todas as letras em minusculas
        for (int i=0; i<nomeInteiro.length(); i++){
            letra = nomeInteiro.charAt(i);
            letraCode = letra;
            if(letra != ' '){
                if(letraCode < 97 ){
                    normal[i] = (char)(letraCode + 32);
                }
                else if(letraCode < 128){
                    normal[i] = letra;
                } else {
                    normal[i] = Character.toLowerCase(letra);
                }
            }
        }

        String nomesMinus = String.copyValueOf(normal);
        String[] nomesNormais = nomesMinus.split(" ");
        int j=0;
        for(String nome: nomesNormais){ // as primeiras letras passam a maiusculas

            if(Arrays.asList(excluir).contains(nome) == false ){
                letraCode = nome.charAt(0);
                normal[j] = (char)(letraCode - 32);
            }
            j += nome.length() + 1;
        }
        System.out.println(normal);
    }
}

