import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        i = scanner.nextInt();

        Integer i1 = i;

        System.out.println("Número informado com tipo Wrapper: " + i1);
    }
}