import java.util.Scanner;

public class Hari36_LuasBelahKetupat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan diagonal 1 = ");
        int diagonal1 = input.nextInt();
        System.out.println("Masukkan diagonal 2 = ");
        int diagonal2 = input.nextInt();
        double luas = (double) (diagonal1 * diagonal2) /2;

        System.out.println("Luas dari Belah Ketupat dengan diagonal 1 nya adalah "+diagonal1+" cm, dan diagonal 2 nya adalah "+diagonal2+" cm, adalah "+luas+" cm");
    }
}
