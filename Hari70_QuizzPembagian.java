import java.util.Random;
import java.util.Scanner;

public class Hari70_QuizzPembagian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        double angkaSoal1 = random.nextInt(100);
        double angkaSoal2 = random.nextInt(100);
        double soal = angkaSoal1/angkaSoal2;
        System.out.println(angkaSoal1+ " : "+ angkaSoal2 +" = ......?");
        System.out.print("Jawab = ");
        double angka = input.nextDouble();
        if((soal)==angka){
            System.out.println("Jawaban Anda benar!!!");
        }else{
            System.out.println("Jawaban Anda salah!!!");
        }
    }
}
