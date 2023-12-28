import java.util.Scanner;

public class Hari81_MenghitungDiagonalBujurSangkar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi bujur sangkar: ");
        double sisi = input.nextDouble();
        double panjangDiagonal = sisi * Math.sqrt(2);
        System.out.println("Panjang diagonal bujur sangkar: " + panjangDiagonal);
    }
}
