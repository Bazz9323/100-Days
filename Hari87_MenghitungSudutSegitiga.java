import java.util.Scanner;

public class Hari87_MenghitungSudutSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sudut A : ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai sudut B : ");
        int b = input.nextInt();
        int c = 180-a-b;
        System.out.println("Nilai sudut C adalah : "+c);
    }
}
