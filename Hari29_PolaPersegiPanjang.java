import java.util.Scanner;

public class Hari29_PolaPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Baris : ");
        int a = input.nextInt();
        System.out.println("Masukkan Kolom : ");
        int b = input.nextInt();
        for (int i = 1; i <=a; i++) {
            System.out.println();
            for (int j = 1; j <=b ; j++) {
                System.out.print("* ");
            }
        }
    }
}
