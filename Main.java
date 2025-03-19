
//Создайте массив из 5 чисел и найдите их сумму.



public class Main {
    public static void main(String[] args) {
        IsFor f = new IsFor();
        f.Massive();
    }

    static class IsFor {
        public void Massive() {
            int [] numbers = new int [] {1,4,5,6,7};
            int sum = 0;
            for (int a : numbers)
                {
                     sum= sum+a;
                 }
            System.out.println("Сумма: " + sum);
        }
    }
}
