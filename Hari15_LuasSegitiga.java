import java.util.Scanner;

public class Hari15_LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang Alas Segitiga : ");
        int alas = input.nextInt();
        System.out.println("Masukkan Tinggi Segitiga : ");
        int tinggi = input.nextInt();
        int luas = (alas*tinggi)/2;

        System.out.println("Luas dari Segitiga dengan panjang alas "+alas+" cm dan tinggi "+tinggi+" cm, adalah "+luas+" cm²");

    }
}
