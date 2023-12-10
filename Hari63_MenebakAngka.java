import java.util.Random;
import java.util.Scanner;

public class Hari63_MenebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int acak = random.nextInt(1000);
        int nyawa = 5;
        while (nyawa > 0){
            System.out.println("Masukkan angka : ");
            int angka = input.nextInt();
            if(angka == acak){
                System.out.println(angka+ " adalah tebakan yang benar!!!");
                break;
            }else if(angka > acak){
                System.out.print(angka+ " angka terlalu besar,");
                nyawa-=1;
                System.out.println(" kesempatan anda tersisa "+nyawa);
            } else if (angka < acak) {
                System.out.print(angka+ " angka terlalu kecil,");
                nyawa-=1;
                System.out.println(" kesempatan anda tersisa "+nyawa);
            }
        }
        System.out.println("kesempatan anda habis, angka yang tepat adalah "+acak);

    }
}
