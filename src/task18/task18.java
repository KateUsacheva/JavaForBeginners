package task18;
/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную. Количество строк после перезаписи должно быть столько же,
 сколько и в изначальном варианте.
**/

import java.io.*;

public class task18 {
    public static void main(String[] args) {
        String S;
        int CS = 0; /// кол-во строк
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\task18.txt"));
            while ((S = br.readLine()) != null) {
                System.out.println(S) ;
                CS++;
            }
            System.out.println("кол-во строк =" + CS + " Введите данные");
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода" + exc);
        }
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int CS2=0;
        try (FileWriter fw = new FileWriter("D:\\task18.txt",false) )
        {
            do {
                 CS2++;
                System.out.print(": ");
                S= br.readLine();
                if (CS2>CS) break; /// здесь должно быть сравнение строк было введено
                S=S + "\r\n";
                fw.write(S);
            }
            while (CS2<=CS);
        } catch (IOException exc)
        {
            System.out.println("Неверное количество строк");
        }
    }
}