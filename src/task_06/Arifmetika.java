package task_06;

import java.util.Scanner; // импорт сканера
public class Arifmetika
{
    public static void main(String[]srgs){

        Scanner in=new Scanner(System.in);
        double a,b,c;
        System.out.println("Введите число X ");
        a=in.nextDouble();
        System.out.println("Введите число Y ");
        b=in.nextDouble();
        System.out.println("Введите число Z");
        c=in.nextDouble();

        double srednee= (a+b+c)/3;
        System.out.println("Среднее арифметическое= " + srednee);
    }

}




