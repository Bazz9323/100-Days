import java.util.Scanner;

public class Hari14_LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang Persegi Panjang : ");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar Persegi Panjang : ");
        int lebar = input.nextInt();
        int luas = panjang*lebar;

        System.out.println("Luas dari Persegi Panjang dengan panjang "+panjang+" cm dan lebar "+lebar+" cm, adalah "+luas+" cm²");

    }
}
