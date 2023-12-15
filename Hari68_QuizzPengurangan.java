import java.util.Random;
import java.util.Scanner;

public class Hari68_QuizzPengurangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int angkaSoal1 = random.nextInt(1000);
        int angkaSoal2 = random.nextInt(1000);
        System.out.println(angkaSoal1+ " - "+ angkaSoal2 +" = ......?");
        System.out.print("Jawab : ");
        int angka = input.nextInt();
        if((angkaSoal1-angkaSoal2)==angka){
            System.out.println("Jawaban Anda benar!!!");
        }else{
            System.out.println("Jawaban Anda salah!!!");
        }
    }
}
