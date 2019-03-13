package task_11;
/*Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран. */
import java.util.Scanner;

public class Task_11
{
    public static void main(String[] args)
    {
                Scanner scan = new Scanner(System.in);
                String s = scan.nextLine();
                System.out.println(s);

    }
}