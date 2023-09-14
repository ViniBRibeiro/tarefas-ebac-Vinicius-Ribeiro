import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        double media;

        System.out.println("Informe as 4 notas do aluno de 0 a 10:");
        do {
            System.out.println("Nota 01: ");
            n1 = scanner.nextDouble();
        }while (n1>10 || n1<0);

        do {
            System.out.println("Nota 02: ");
            n2 = scanner.nextDouble();
        }while (n2>10 || n2<0);
        do {
            System.out.println("Nota 03: ");
            n3 = scanner.nextDouble();
        }while (n3>10 || n3<0);
        do {
            System.out.println("Nota 04: ");
            n4 = scanner.nextDouble();
        }while (n4>10 || n4<0);

        media = (n1+n2+n3+n4)/4;

        if(media>=7){
            System.out.println("\nMédia: " + media);
            System.out.println("Aluno Aprovado!");
        } else if (media>=5){
            System.out.println("\nMédia: " + media);
            System.out.println("Aluno em Recuperação!");
        }else{
            System.out.println("\nMédia: " + media);
            System.out.println("Aluno Reprovado!");
        }



    }
}
