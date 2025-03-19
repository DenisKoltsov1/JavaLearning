
//Считайте сумму чисел от 1 до n, где n вводит пользователь (while)
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsFor f = new IsFor();
        f.Vivod();
    }

    static class IsFor {
        public void Vivod() {
            System.out.println("Введите число n:");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum = sum + i;
                i++;
            }

            System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
        }
    }
}
