import java.util.Scanner;

public class Hari30_SegitigaTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int a = input.nextInt();

        for (int i = a; i >=1; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
    }
}
