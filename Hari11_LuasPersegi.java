import java.util.Scanner;

public class Hari11_LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang Sisi Persegi : ");
        int Panjang = input.nextInt();
        int luas = Panjang*Panjang;

        System.out.println("Luas dari persegi dengan panjang sisi "+Panjang+" cm adalah "+luas+" cm² ");
    }
}
