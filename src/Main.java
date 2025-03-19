

import java.util.Scanner;
//Напишите программу, которая выводит числа от 0 до 10 (for).
public class Main {
    public static void main(String[] args) {
        IsFor f = new IsFor();
        f.Vivod();
    }

    static class IsFor {
        public void Vivod() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }
}
