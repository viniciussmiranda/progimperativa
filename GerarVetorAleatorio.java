import java.util.Random;

public class GerarVetorAleatorio {
    
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        
        preencherVetor(vetor);
        embaralharVetor(vetor);
        imprimirVetor(vetor);
    }

    public static void preencherVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1; 
        }
    }

    public static void embaralharVetor(int[] v) {
        Random random = new Random();
        for (int i = v.length - 1; i > 0; i--) {

            int indiceAleatorio = random.nextInt(i + 1);

            int temp = v[i];
            v[i] = v[indiceAleatorio];
            v[indiceAleatorio] = temp;
        }
    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
