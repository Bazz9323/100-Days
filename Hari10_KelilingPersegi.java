import java.util.Scanner;

public class Hari10_KelilingPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang Sisi Persegi : ");
        int Panjang = input.nextInt();
        int keliling = Panjang*4;

        System.out.println("Keliling dari persegi dengan panjang sisi "+Panjang+" cm adalah "+keliling+" cm");
    }
}
