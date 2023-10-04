import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaMasculino = new ArrayList<>();
        List<String> listaFeminino = new ArrayList<>();

        System.out.println("Digite o nome e sexo das pessoas, sendo M masculino e F feminino:");
        System.out.println("Exemplo: João-M,Julia-F");
        String n = scanner.nextLine();

        String[] pessoa = n.split(",");

        for (String pessoas :pessoa){
            String[] partes = pessoas.split("-");

            if (partes.length == 2){
                String nome = partes[0];
                String genero = partes[1].toLowerCase().trim();

                if(genero.equals("m")){
                    listaMasculino.add(nome);
                }else if (genero.equals("f")) {
                    listaFeminino.add(nome);
                }
            }

        }
        Collections.sort(listaMasculino);
        Collections.sort(listaFeminino);
        System.out.println("Lista genero masculino" + listaMasculino);
        System.out.println("Lista genero feminino" + listaFeminino);
    }
}
