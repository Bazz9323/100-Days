import java.util.Scanner;

public class Hari35_KelilingBelahKetupat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang Sisi Belah Ketupat : ");
        int Panjang = input.nextInt();
        int keliling = Panjang*4;

        System.out.println("Keliling dari Belah Ketupat dengan panjang sisi "+Panjang+" cm adalah "+keliling+" cm");
    }
}
