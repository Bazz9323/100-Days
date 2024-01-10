import java.util.Scanner;

public class Hari94_GabunganKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata pertama: ");
        String kata1 = input.next();
        System.out.println("Masukkan kata kedua: ");
        String kata2 = input.next();
        String gabungan = kata1 +" "+ kata2;
        System.out.println(gabungan);
    }
}
