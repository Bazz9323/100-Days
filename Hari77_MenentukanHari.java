import java.util.Scanner;

public class Hari77_MenentukanHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka untuk menentukan hari : ");
        int n = input.nextInt();
        if (n == 1 || n % 7 == 1) {
            System.out.println("Senin");
        } else if (n == 2 || n % 7 == 2) {
            System.out.println("Selasa");
        } else if (n == 3 || n % 7 == 3) {
            System.out.println("Rabu");
        } else if (n == 4 || n % 7 == 4) {
            System.out.println("Kamis");
        } else if (n == 5 || n % 7 == 5) {
            System.out.println("Jumat");
        } else if (n == 6 || n % 7 == 6) {
            System.out.println("Sabtu");
        } else if (n == 7 || n % 7 == 0) {
            System.out.println("Minggu");
        } else {
            System.out.println("Pilihan Tidak Tersedia");
        }
    }
}

