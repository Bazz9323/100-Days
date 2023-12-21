import java.util.Random;

public class Hari74_BilanganBulatRandom {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Bilangan bulat acak antara 1 dan 100:");
        for (int i = 0; i < 5; i++) {
            int randomInt = random.nextInt(100) + 1;
            System.out.println(randomInt);
        }
    }
}
