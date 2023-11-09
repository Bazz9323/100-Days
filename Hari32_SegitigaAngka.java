import java.util.Scanner;

public class Hari32_SegitigaAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int a = input.nextInt();
        int b = 0;
        for (int i = 1; i <=a; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                b+=1;
                System.out.print(b +"\t");
            }
        }
    }
}
