package task_07;
import java.util.Scanner; // импорт сканера
public class Compare {
    public static void main(String[] srgs) {
        Scanner in = new Scanner(System.in);
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("Введите число T ");
        int T = in.nextInt();
        if (T == x)
        {
            System.out.println("Данное значение имеется в константах ");
        }
             else if (T == y)
             {
            System.out.println("Данное значение имеется в константах ");
        }
               else if (T == z)
               {
            System.out.println("Данное значение имеется в константах ");
        }
              else   System.out.println("Такой константы нет! ");

        }

    }

