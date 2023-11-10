import java.util.Scanner;

public class Hari33_SegitigaBaris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int a = input.nextInt();
        int b = 0;
        for (int i = 1; i <=a; i++) {
            System.out.println();
            b+=1;
            for (int j = 0; j < i; j++) {
                System.out.print(b +"\t");
            }
        }
    }
}
