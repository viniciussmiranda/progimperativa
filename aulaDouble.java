import java.util.Scanner;

public class aulaDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double [] notas = new double[5];
        double soma = 0;
        notas[0] = 5;
       

        for (int i=0; i < notas.length; i += 1){
            System.out.print("Digite a " + (i + 1) + "a nota: ");
            notas[i] = input.nextDouble();
            soma += notas[i]; 

        }

        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        double media = soma / notas.length;
        System.out.println("\nMédia da turma: " + media);


    }
    
}
