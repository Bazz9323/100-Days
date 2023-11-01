import java.util.Scanner;

public class Hari24_BilanganPositifDanNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int angka = input.nextInt();

        if(angka >0){
            System.out.println(angka+" adalah bilangan positif");
        }else {
            System.out.println(angka+" adalah bilangan negatif");
        }
    }
}
