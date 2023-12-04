import java.util.Scanner;

public class Hari57_OperatorLogikaTidakSamaDengan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        if(!kata.equalsIgnoreCase("bukan")){
            System.out.println("Program berhasil");
        }else{
            System.out.println("Program gagal");
        }
    }
}
