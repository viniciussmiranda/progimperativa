import java.util.Scanner;

public class ReverterVetor {

    public static void preencherVetor(int[] v, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("digite o elemento " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
    }

    public static void reverter(int[] v, int n) {
        for (int i = 0; i < n / 2; i++) {
            int aux = v[i];
            v[i] = v[n - 1 - i];
            v[n - 1 - i] = aux;
        }
    }

    public static void imprimir(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static boolean validarFibonacci(int[] v, int n) {
        int penult = 0, ultima = 1, atual;
        System.out.print("0 1");
        for (int i = 0; i < n; i += 1) {
            atual = penult + ultima;
            System.out.print(atual + " ");

            penult = ultima;
            ultima = atual;


        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        preencherVetor(vetor, n, sc);

        System.out.print("vetor original: ");
        imprimir(vetor, n);

        reverter(vetor, n);

        System.out.print("vetor invertido: ");
        imprimir(vetor, n);

        // Chama a função validarFibonacci
        validarFibonacci(vetor, n);

        sc.close();
    }
}
