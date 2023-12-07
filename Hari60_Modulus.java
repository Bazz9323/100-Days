import java.util.Scanner;

public class Hari60_Modulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        System.out.println("Masukkan angka modulus : ");
        int modulus = input.nextInt();
        int hasil = angka%modulus;
        System.out.println(hasil);
    }
}
