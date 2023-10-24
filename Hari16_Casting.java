import java.util.Scanner;

public class Hari16_Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan desimal yang akan di ubah menjadi bilangan bulat : ");
        double iniDouble = input.nextDouble();
        int iniInteger = (int) iniDouble;
        System.out.println("Sebelum di Ubah "+iniDouble);
        System.out.println("Setelah di Ubah "+iniInteger);
    }
}
