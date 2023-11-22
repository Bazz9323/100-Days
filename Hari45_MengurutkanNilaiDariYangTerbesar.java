import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Hari45_MengurutkanNilaiDariYangTerbesar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan Panjang Array : ");
        Integer[] angka = new Integer[input.nextInt()];
        System.out.println("Masukkan Nilai Array : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(angka));
        Arrays.sort(angka, Collections.reverseOrder());
        System.out.println(Arrays.toString(angka));
    }
}
