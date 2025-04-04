import java.util.Random;

public class GerarVetorUnico {
    public static void main(String[] args) {
      
        int tamanhoVetor = 1000;
        int limiteInferior = 1;
        int limiteSuperior = 1000;

      
        int[] vetorNumeros = new int[tamanhoVetor];

        Random random = new Random();

       
        for (int i = 0; i < tamanhoVetor; i++) {
            int numero;
            boolean numeroRepetido;

            do {
               
                numero = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
                numeroRepetido = false;

                for (int j = 0; j < i; j++) {
                    if (vetorNumeros[j] == numero) {
                        numeroRepetido = true; 
                        break;
                    }
                }
            } while (numeroRepetido); 

      
            vetorNumeros[i] = numero;
        }

   
        for (int numero : vetorNumeros) {
            System.out.println(numero);
        }
    }
}
