import java.util.Calendar;
import java.util.Scanner;

public class Hari76_HitungUmur {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar kalender = Calendar.getInstance();
        int tahunSekarang = kalender.get(Calendar.YEAR);
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + (tahunSekarang - tahunLahir) + " Tahun");

    }

}