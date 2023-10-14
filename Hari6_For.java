import java.util.Scanner;

public class Hari6_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas perulangan : ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            System.out.println(i);
        }
    }
}
