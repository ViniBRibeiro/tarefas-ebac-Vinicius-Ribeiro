import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>listaNomes = new ArrayList<>();

        System.out.println("Digite o nome de pessoas separados por virgula:");
        String n = scanner.nextLine();
        String[] nomes = n.split(",");

        for(String nome : nomes ){
            listaNomes.add(nome);
        }
        Collections.sort(listaNomes);
        System.out.println(listaNomes);
    }
}
