package task_13;
/*Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
 Вывести на экран строку с наибольшей длинной.
  */
        import java.util.Scanner;
public class CompareString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String A1 = scan.nextLine();
        String A2 = scan.nextLine();
        int len1 = A1.length();
        int len2 = A2.length();
        if (len1>len2)
            System.out.println(A1);
        else  if (len1<len2)
            System.out.println(A2);
        else System.out.println("Длины строк равны");
    }
}
