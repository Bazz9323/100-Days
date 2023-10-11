import java.util.Scanner;

public class Hari2_Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka :");
        double a = input.nextInt();
        System.out.println("Masukkan angka :");
        double b = input.nextInt();

        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" x "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
    }
}
