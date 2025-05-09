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


    public static boolean temFibonacci(int[] v, int n) {
        for (int i = 0; i <= n - 3; i++) {
            int a = v[i];
            int b = v[i + 1];

            if (!inicioValido(a, b)) continue;

            int count = 2;
            int j = i + 2;

            while (j < n && v[j] == a + b) {
                int c = a + b;
                a = b;
                b = c;
                count++;
                j++;
            }

            if (count >= 3) return true;
        }

        return false;
    }

    public static boolean inicioValido(int a, int b) {
        return (a == 1 && b == 1) || (a + b >= 0); 
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

        if (temFibonacci(vetor, n)) {
            System.out.println("o vetor contém uma subsequência da sequência de Fibonacci com pelo menos 3 números consecutivos.");
        } else {
            System.out.println("o vetor NÃO contém uma subsequência da sequência de Fibonacci com pelo menos 3 números consecutivos.");
        }

        sc.close();
    }
}
