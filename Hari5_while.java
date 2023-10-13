import java.util.Scanner;

public class Hari5_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas perulangan : ");
        int batas = input.nextInt();
        int i = 1;

        while (i<=batas){
            System.out.println(i);
            i++;
        }
    }
}
