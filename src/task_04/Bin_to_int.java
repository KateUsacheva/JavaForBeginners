package task_04;
import java.util.Scanner;
public class Bin_to_int {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Input binary number: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin, 2);

        System.out.println(binNum);
    }
}
