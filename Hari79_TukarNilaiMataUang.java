import java.util.Scanner;

public class Hari79_TukarNilaiMataUang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nomianal uang dollar : ");
        int dolar = input.nextInt();
        int tukar = dolar*15413;
        System.out.println("rupiah : " +tukar);
    }
}
