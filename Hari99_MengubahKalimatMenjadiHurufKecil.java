import java.util.Scanner;

public class Hari99_MengubahKalimatMenjadiHurufKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat (gunakan huruf besar): ");
        String kalimat = input.nextLine();
        String kalimatKecil = kalimat.toLowerCase();
        System.out.println("Kalimat dalam huruf kecil: " + kalimatKecil);
    }
}
