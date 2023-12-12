import java.util.Random;
import java.util.Scanner;

public class Hari65_BatuGuntingKertas {
    public static void main(String[] args) {
        String [] arraySuit = {"batu","gunting","kertas"};
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih batu,gunting, atau kertas");
        String user = input.nextLine();
        Random random = new Random();
        int indexKomputer = random.nextInt(arraySuit.length);
        String komputer = arraySuit[indexKomputer];

        System.out.println("User\t\t: "+user);
        System.out.println("Komputer\t:"+komputer);

        if(user.equalsIgnoreCase(komputer)){
            System.out.println("Hasil\t: Seri!");
        } else if (user.equalsIgnoreCase("batu") && komputer.equalsIgnoreCase("gunting")) {
            System.out.println("Hasil\t: Anda Menang!");
        } else if (user.equalsIgnoreCase("gunting") && komputer.equalsIgnoreCase("kertas"))  {
            System.out.println("Hasil\t: Anda Menang!");
        } else if (user.equalsIgnoreCase("kertas") && komputer.equalsIgnoreCase("batu")) {
            System.out.println("Hasil\t: Anda Menang!");
        } else {
            System.out.println("Hasil\t: Anda Kalah!");
        }
    }
}
