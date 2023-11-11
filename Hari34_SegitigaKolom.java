import java.util.Scanner;

public class Hari34_SegitigaKolom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int a = input.nextInt();

        for (int i = 1; i <=a; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(j +"\t");
            }
        }
    }
}
