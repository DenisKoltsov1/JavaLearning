//Напишите метод, который принимает два числа и возвращает их произведение.

public class Main {
    public static void main(String[] args) {
        IsFor f = new IsFor();
        System.out.println(f.toNumbers( 3, 4));
    }

    static class IsFor {
        public int toNumbers(int a, int b) {
           return a*b;
        }
        }
}