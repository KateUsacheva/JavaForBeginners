package task_10;
import java.util.Scanner;
public class Matrica
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int AR[][] = new int [2][3];
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            AR[i][j]= sc.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("Inserted array elements:");
        for (int j = 0; j < 3; j++)
        {
            System.out.print (" " + 3*AR[0][j]); // Выводим на экран, полученный массив
        }
    }
}
