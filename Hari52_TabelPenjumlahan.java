import java.util.Scanner;

public class Hari52_TabelPenjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int angka = input.nextInt();
        System.out.println("Penjumlahan "+angka);
        for (int i = 1; i <= angka; i++) {
            System.out.println(i+" + "+angka+" = "+(i+angka));
        }
    }
}
