import java.util.Random;

public class Exemplo5 {
    public static Random geradorAleat = new Random();
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i +=1); {
            int somatorio = 0;
            // int aleatorio = (int) Math.floor(Math.random() * 6) + 1;
            int aleatorio = geradorAleat.nextInt(6) + 1;
            System.out.println(aleatorio);
            somatorio += aleatorio;
        
        }
         
    }
    
}
