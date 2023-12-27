import java.util.Scanner;

public class Hari80_MenghitungKecepatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jarak (km) : ");
        double jarak = input.nextDouble();
        System.out.println("masukkan waktu (jam) : ");
        double waktu = input.nextDouble();
        double kecepatan = jarak/waktu;
        System.out.println("kecepatannya adalah "+kecepatan+" km/jam");
    }
}
