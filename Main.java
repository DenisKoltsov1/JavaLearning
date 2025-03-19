
//Напишите программу, которая считает площадь прямоугольника (длина и ширина — double).
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        IsFor f = new IsFor();
        f.Square();
    }

    static class IsFor {
        public void Square() {
            System.out.println("Введите длинну");
            Scanner scanner = new Scanner(System.in);
            double length =scanner.nextDouble();
            System.out.println("Длинна:"+ length);

            System.out.println("Введите ширину");
            double width = scanner.nextDouble();
            System.out.println("Ширина:"+ width);

            System.out.println("Площадь равна");

            double square = length * width;

            System.out.println("Площадь: " + square);


            scanner.close();
        }
    }
}
