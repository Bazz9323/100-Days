import java.util.Scanner;

public class Hari49_LuasPermukaanBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang : ");
        int p = input.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        int t = input.nextInt();
        int luas = 2 * ((p*l) + (l*t) + (p*t));
        System.out.println("Luas permukaan balok adalah "+luas);
    }
}
