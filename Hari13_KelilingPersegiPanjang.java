import java.util.Scanner;

public class Hari13_KelilingPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang Persegi Panjang : ");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar Persegi Panjang : ");
        int lebar = input.nextInt();
        int keliling = 2*(lebar+panjang);

        System.out.println("Keliling dari Persegi Panjang dengan panjang "+panjang+" cm dan lebar "+lebar+" cm, adalah "+keliling+" cm");

    }
}
