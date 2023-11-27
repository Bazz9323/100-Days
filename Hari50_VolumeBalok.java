import java.util.Scanner;

public class Hari50_VolumeBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang : ");
        int p = input.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        int t = input.nextInt();
        int volume = p*l*t;
        System.out.println("Volume balok adalah "+volume);
    }
}
