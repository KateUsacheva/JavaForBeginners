package task_14;
/*Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
Все три числа разных типов необходимо в столбик вывести на экра
  */
import java.util.Random;
import java.util.Scanner;
public class SORT
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try {
        String S = scan.next();
        Integer X = new Integer(S);
        double Y = X;
            System.out.println(S);
            System.out.println(X);
            System.out.println(Y);
        }catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }
}
