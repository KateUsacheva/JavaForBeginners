package task_16;
//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
import java.io.*;
public class task_16 {
    public static void main(String[] args) {
 String S;
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\task16.txt"));
            while ((S = br.readLine()) != null){
                System.out.println(S);
            }
        }catch (IOException exc){
            System.out.println("Ошибка ввода-вывода" + exc);
        }
    }
}
