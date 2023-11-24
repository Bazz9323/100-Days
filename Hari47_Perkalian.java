import java.util.Scanner;

public class Hari47_Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        System.out.println("Perkalian "+ angka);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+angka+" = "+(i*angka));
        }
    }
}
