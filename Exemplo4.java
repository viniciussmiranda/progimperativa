import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Digite seu peso: ");
    
        double peso;
        peso = input.nextDouble();
        System.out.println("Você digitou o peso " + peso);

        System.out.println("Digite sua altura");
        double altura = input.nextDouble(); 
        System.out.println("Você digitou a altura " + altura);

        System.out.println("Seu IMC é: " + peso / (altura * altura ));

    
    }
    
 }

