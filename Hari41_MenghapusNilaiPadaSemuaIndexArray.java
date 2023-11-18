import java.util.Arrays;
import java.util.Scanner;

public class Hari41_MenghapusNilaiPadaSemuaIndexArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan Panjang Array : ");
        int[] angka = new int[input.nextInt()];
        System.out.println("Masukkan Nilai Array : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }
        System.out.println("Sebelum Dihapus : "+Arrays.toString(angka));

        for (int i = 0; i < angka.length; i++) {
            angka[i] = 0;
        }
        System.out.println("Setelah Dihapus : "+Arrays.toString(angka));
    }
}
