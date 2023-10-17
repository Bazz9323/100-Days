import java.util.Scanner;

public class Hari9_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka antara 1 - 3: ");
        int angka = input.nextInt();

        if (angka == 1) {
            System.out.println("Satu");
        } else if (angka == 2) {
            System.out.println("Dua");
        } else if (angka == 3) {
            System.out.println("Tiga");
        }else {
            System.out.println("angka bukan 1, 2 ataupun 3");
        }

    }
}
