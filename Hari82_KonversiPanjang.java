import java.util.Scanner;

public class Hari82_KonversiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan panjang (KM) : ");
        int km = input.nextInt();
        System.out.println(km+" KM = "+(km*1000)+" M");
    }
}
