package task_06;

import java.util.Scanner; // импорт сканера
public class Arifmetika
{
    public static void main(String[]srgs){

        Scanner in=new Scanner(System.in);
        double x,y,z;
        System.out.println("Введите число X ");
        x=in.nextDouble();
        System.out.println("Введите число Y ");
        y=in.nextDouble();
        System.out.println("Введите число Z");
        z=in.nextDouble();

        double srednee= (x+y+z)/3;
        System.out.println("Среднее арифметическое= " + srednee);
    }

}




