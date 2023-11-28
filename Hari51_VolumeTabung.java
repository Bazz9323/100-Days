import java.util.Scanner;

public class Hari51_VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Tinggi Tabung : ");
        double tinggi = input.nextInt();
        double Jari = 7.0;
        double Pi = 3.14;
        double volume = Pi*(Jari*Jari)*tinggi;
        System.out.println("Volume tabung adalah "+volume);
    }
}
