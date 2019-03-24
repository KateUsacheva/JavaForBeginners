package task_15;
/*Необходимо написать программу для сортировки данных массива по возрастанию.
Использовать пузырьковый метод сортировки.*/
import  java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        int[] Array1 = {2, 5, 8, 3, 7, 9};
        System.out.println(Arrays.toString(Array1));
        bubbleSort(Array1);
    }
    public static void bubbleSort(int[] arr)
    {
        for (int i = arr.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}