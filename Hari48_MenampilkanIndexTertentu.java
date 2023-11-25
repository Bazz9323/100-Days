import java.util.Scanner;

public class Hari48_MenampilkanIndexTertentu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {6,3,5,9,1,2};
        int x = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==x){
                System.out.println(i);
            }
        }
    }
}
