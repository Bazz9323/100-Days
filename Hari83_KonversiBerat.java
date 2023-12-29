import java.util.Scanner;

public class Hari83_KonversiBerat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan berat (KG) : ");
        int kg = input.nextInt();
        System.out.println(kg+" KG = "+(kg*1000)+" G");
    }
}
