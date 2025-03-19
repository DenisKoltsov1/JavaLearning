
//Напишите программу, которая проверяет, положительное ли число, и выводит сообщение.
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsFor f = new IsFor();
        f.Positive();
    }

    static class IsFor {
        public void Positive() {
            System.out.println("Введите любое число");
            Scanner scanner = new Scanner(System.in);
            int n =scanner.nextInt();
            if  (n<0)
             {
                 System.out.println("Число  отрицательное");
             }
            else if(n>0)
             {
                 System.out.println("Число  положительное");
             }
            else
             {
                 System.out.println("Число  равно 0 ");
             }
            scanner.close();
        }
    }
}
