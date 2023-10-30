import java.util.Scanner;

public class Hari22_Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();

        if(angka%2==1){
            System.out.println(angka+1);
        }else{
            System.out.println(angka);
        }
    }
}
