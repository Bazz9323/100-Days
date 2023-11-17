import java.util.Arrays;
import java.util.Scanner;

public class Hari40_MenghapusNilaiPadaSuatuIndexArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan Panjang Array : ");
        int[] angka = new int[input.nextInt()];
        System.out.println("Masukkan Nilai Array : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(angka));
        System.out.println("Masukkan Index Yang Ingin Dikosongkan : ");
        int hapus = input.nextInt();
        angka[hapus]= 0;
        System.out.println(Arrays.toString(angka));
    }
}
