package FinalTask02;
/*Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен, задавать размер массива и наполнять его числами.*/
import java.util.Arrays;
import java.util.Scanner;
public class SortA
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = sc.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // меняем элементы местами
                   int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
    }
}
