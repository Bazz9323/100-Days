import java.util.Arrays;
import java.util.Scanner;

public class Hari37_Array1Dimensi {
    public static void main(String[] args) {
       int [] array = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka sebanyak 5 kali = ");
        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();
        array[3] = input.nextInt();
        array[4] = input.nextInt();

        System.out.println(Arrays.toString(array));
    }
}
