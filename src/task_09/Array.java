package task_09;
import java.util.Scanner;
public class Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = sc.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + 2*array[i]); // Выводим на экран, полученный массив
        }
    }
}
