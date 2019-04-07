package FinalTask03;
/*Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
 Итоговое значение должно быть округлено до двух знаков после запятой.*/
import java.util.Scanner;
import java.io.PrintStream;
public class Konvert
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий курс: ");
        double kurs = sc.nextDouble();
        System.out.println("Введите количество рублей: ");
        double num = sc.nextDouble();
        double Total = num / kurs;
        System.out.format(" Ваша сумма в долларах = %.2f  USD" , Total);
    }
}

