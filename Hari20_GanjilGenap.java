import java.util.Scanner;

public class Hari20_GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka awal : ");
        int awal = input.nextInt();
        System.out.println("Masukkan batas angka : ");
        int batas = input.nextInt();

        for (int i = awal; i <= batas; i++) {
            if (i%2==0){
                System.out.println("Bilangan Genap -> "+i);
            }else {
                System.out.println("Bilangan Ganjil -> "+i);
            }
        }
    }
}
