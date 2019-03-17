package task_12;
/*Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.*/

import java.util.Scanner;

public class BEZ_Probelov {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        //строка 2 из 1

        String string2 = string1.replaceAll(" ", "");
        System.out.println(string2);

    }
}