import java.util.Scanner;

public class Hari7_doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas perulangan : ");
        int batas = input.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<=batas);
    }
}
