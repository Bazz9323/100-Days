import java.util.Scanner;
public class Hari27_KandangBebek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = 0;
        for (int i = 0; i < a; i++) {
            int b = input.nextInt();
            c+=b;
        }
        System.out.println(c);
    }
}
