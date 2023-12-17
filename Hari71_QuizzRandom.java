import java.util.Random;
import java.util.Scanner;

public class Hari71_QuizzRandom {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    String [] arrayOperasi = {"*","+","-","/"};
    double angkaSoal1 = random.nextInt(100);
    double angkaSoal2 = random.nextInt(100);
    int indexOperasi = random.nextInt(arrayOperasi.length);
    String operasi = arrayOperasi[indexOperasi];
    System.out.println(angkaSoal1 +" " +operasi+" " + angkaSoal2 +" = ......?");
    System.out.print("Jawab = ");
    double angka = input.nextDouble();
    if(operasi == "+"){
        if((angkaSoal1+angkaSoal2)==angka){
            System.out.println("Jawaban Anda benar!!!");
        }else{
            System.out.println("Jawaban Anda salah!!!");
        }
    }else if(operasi == "-"){
        if((angkaSoal1-angkaSoal2)==angka){
            System.out.println("Jawaban Anda benar!!!");
        }else{
            System.out.println("Jawaban Anda salah!!!");
        }
    }else if(operasi == "*"){
        if((angkaSoal1*angkaSoal2)==angka){
            System.out.println("Jawaban Anda benar!!!");
        }else{
            System.out.println("Jawaban Anda salah!!!");
        }
    }else if(operasi == "/"){
        if((angkaSoal1/angkaSoal2)==angka){
            System.out.println("Jawaban Anda benar!!!");
        }else{
            System.out.println("Jawaban Anda salah!!!");
        }
    }
}
}
