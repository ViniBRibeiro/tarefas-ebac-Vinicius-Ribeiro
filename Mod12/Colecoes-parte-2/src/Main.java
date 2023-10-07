import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new LinkedList<>();
        List<String> feminino = new LinkedList<>();

        System.out.println("Digite o nome e sexo das pessoas, sendo 'm' masculino e 'f' feminino:");
        System.out.println("Exemplo: Pedro-m,Carla-f,...");
        String p = scanner.nextLine();

        String[] pessoa = p.split(",");
        for (String pessoas:pessoa){
            String[] partes = pessoas.split("-");

            if (partes.length==2){
                String nome = partes [0];
                String genero = partes[1].toLowerCase().trim();
                if (genero.equals("m")){
                    masculino.add(nome);
                } else if (genero.equals("f")) {
                    feminino.add(nome);
                }
            }
        }
        System.out.println("Lista masculino: " + masculino);
        System.out.println("Lista feminino: " + feminino);
    }
}