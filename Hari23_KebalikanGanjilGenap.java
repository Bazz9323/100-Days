import java.util.Scanner;

public class Hari23_KebalikanGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int angka = input.nextInt();

        if(angka%2==0){
            System.out.println(angka+1+" Ganjil");
        }else {
            System.out.println(angka+1+" Genap");
        }
    }
}
