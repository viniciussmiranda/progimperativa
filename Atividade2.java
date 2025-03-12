public class Atividade2 {

    public static void main(String[] args) {
    
        welcome(); 

        while (true) {
            int dice1 = (int)(Math.random() * 6 + 1); 
            int dice2 = (int)(Math.random() * 6 + 1); 
            int sum = dice1 + dice2;
        
            System.out.println("Roll: total = " + sum); 
        
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Desculpe " + sum + " Você perdeu");
                break;
            } else if (sum == 7 || sum == 11) { 
                System.out.println("Yassss " + sum + " você ganhou!!");
                break; 
            }
        }
    }

    public static void welcome() {
        System.out.println("Bem vindo ao jogo dos dados"); 
}
}