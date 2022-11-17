import java.util.Arrays;
import java.util.Scanner;

public class TP2_08_Normalizar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome completo.");
        String nomeInteiro = scanner.nextLine();

        String[] nomes = nomeInteiro.split("\\s+/");
        String[] excluir = {"do", "da", "dos", "das", "e", "o", "a"};

        for(String nome: nomes ){
            if(Arrays.asList(excluir).contains(nome)){
                // se tiver maiusculas passar nome para minusculas
                for(char letra: nome){
                    if(ToCode(letra) < 97){
                        letra = ToChar(ToCode(letra)+32);
                    }
                }
            }else{ // é um nome normal, a primeira tem de ser mauiscula
                for(char letra: nome) {
                    // if primeira letra do nome:
                    if (ToCode(letra) >= 97) { // se 1º for minuscula passar para maiuscula
                        nome[0] = ToChar(ToCode(nome[0]) - 32);
                    }
                    //else as outras, passar todas para minusculas se ainda nao forem
                    for (char letra : nome) {
                        if(ToCode(letra) < 97){
                            letra = ToChar(ToCode(letra)+32);
                        }
                    }
                }
            }

        }


/*
        if(ToCode(nome[0]) >= 97 ){
            nome[0] =ToChar(ToCode(nome[0])-32);
        }
        boolean maiuscula = true;
        for(int i=1; i< nome.length(); i++){
            if(nome[i] == " "){
                maiuscula = true;
            }
            else{
                if(ToCode(letra) >= 97 ){
                    letra =ToChar(ToCode(letra)-32);
                }
            }
            if(maiuscula == true){
                if(ToCode(nome[i]) >= 97 ){
                    nome[i] =ToChar(ToCode(nome[0])-32);
                }
            }

        }
        */
    }
}
