import java.util.Arrays;
import java.util.Scanner;

public class Hari43_MenggantiNilaiPadaSemuaIndexArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan Panjang Array : ");
        int[] angka = new int[input.nextInt()];
        System.out.println("Masukkan Nilai Array : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(angka));

        System.out.println("Masukkan Nilai Baru Pada Array : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(angka));
    }
}

