import java.util.Scanner;

public class Hari73_MenghitungPanjangKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan kata : ");
        String kata = input.nextLine();
        int panjangKata = kata.length();
        System.out.println(panjangKata);
    }
}
