import java.util.Scanner;

public class Hari98_Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan total belanjaan : ");
        double total = input.nextDouble();
        double a = (10.0/100.0)*total;
        double b = (20.0/100.0)*total;
        if(total >= 500000 && total < 1000000){
            double hasil = total - a;
            System.out.println(hasil);
        }else if ( total >=1000000){
            double hasil = total - b;
            System.out.println(hasil);
        }else {
            System.out.println(total);
        }
    }
}
