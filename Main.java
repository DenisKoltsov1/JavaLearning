public class Main {
    public static void main(String[] args) {
        IsFor f = new IsFor();
        f.Massive();
    }

    static class IsFor {
        public void Massive() {
            int[][] numbers = new int[3][3]; // Создаём двумерный массив 3x3
            int value = 1; // Начальное значение для заполнения

            // Заполнение массива числами от 1 до 9
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    numbers[i][j] = value; // Присваиваем значение
                    value++; // Увеличиваем значение
                }
            }

            // Вывод массива
            System.out.println("Двумерный массив 3x3:");
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers[i][j] + " "); // Выводим элементы строки
                }
                System.out.println(); // Переход на новую строку после каждой строки массива
            }
        }
    }
}