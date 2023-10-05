import java.util.Random;

public class Main {


    public static void main(String[] args) {


        String name = "julian";
        Random random = new Random();

        for (int i = 1;  i <= 15 ; i++) {
            System.out.println("Hello, I am " + name + " and I am printing the number " + i);

            // Espera un tiempo aleatorio entre 1 y 5 segundos
            int randomDelay = random.nextInt(5) + 1;
            try {
                Thread.sleep(randomDelay * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}