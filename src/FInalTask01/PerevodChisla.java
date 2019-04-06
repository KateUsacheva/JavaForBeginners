package FInalTask01;
/*Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран.
 Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.*/
import java.util.Scanner;
public class PerevodChisla
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число в двоичном формате!Введите числo:  ");
        String S = scanner.nextLine();
        inputBinaryCount(S);
    }
    static void inputBinaryCount(String A)
    {
        String string = new StringBuffer(A).reverse().toString();
        int count = 0;
        for (int i = string.length() - 1; i >= 0; i--)
        {
            if (string.charAt(i) == '1')
            {
                count = count + p( i);
            }
            else if (string.charAt(i) == '0')
            {
                count = count;
            }
                else
                {
                System.out.println("Неверный ввод!");
                break;
                }
        }
        System.out.println("Десятичное число : " + count);
    }
    static  int p ( int b)
    {
        int result = 1;
        for (int i=1; i<=b; i++)
        {
            result = result*2;
        }
        return result;
    }
}
