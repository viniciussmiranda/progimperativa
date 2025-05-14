import java.util.Scanner;

public class Exemplo11 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome: ");
        p1.nome = input.nextLine();
        System.out.println("Digite a idade: ");
        p1.idade = input.nextInt();
        System.out.println("Digite o peso: ");
        p1.peso = input.nextDouble();
        System.out.println("Digite a altura: ");
        p1.altura = input.nextDouble();
    }
}
