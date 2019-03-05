package task_05;
import java.util.Scanner;
public class Umnojenie
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int M1 = a*2;
        sc.close();
        System.out.println(a+"*1="+ 1*a);
        System.out.println(a+"*2="+ 2*a  );
        System.out.println(a+"*3="+ 3*a);
        System.out.println(a+"*4="+ 4*a);
        System.out.println(a+"*5="+ 5*a);
        System.out.println(a+"*6="+ 6*a);
        System.out.println(a+"*7="+ 7*a);
        System.out.println(a+"*8="+ 8*a);
        System.out.println(a+"*9="+ 9*a);
        System.out.println(a+"*10="+ 10*a);
    }
}
