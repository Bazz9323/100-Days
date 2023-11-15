import java.util.Arrays;
import java.util.Scanner;

public class Hari38_InputPanjangArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang Array = ");
        int[] angka = new int[input.nextInt()];
        System.out.println(Arrays.toString(angka));
    }
}
