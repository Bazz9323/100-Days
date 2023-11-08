import java.util.Scanner;

public class Hari31_PolaKotak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Baris : ");
        int a = input.nextInt();
        for (int i = 1; i <=a; i++) {
            System.out.println();
            for (int j = 1; j <=a ; j++) {
                System.out.print("* ");
            }
        }
    }
}
