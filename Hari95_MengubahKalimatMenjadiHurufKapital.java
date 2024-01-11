import java.util.Scanner;
public class Hari95_MengubahKalimatMenjadiHurufKapital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();
        String kapital = kalimat.toUpperCase();
        System.out.println("Kalimat dalam huruf besar: " + kapital);
    }
}
