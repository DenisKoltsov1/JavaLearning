// Создайте класс Car с полями color и speed, выведите их для объекта.
//Добавьте в класс Car метод drive(), который выводит "Машина едет"
public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        mazda.color = "Black";
        mazda.speed = 245;
        mazda.drive();
        System.out.println("Цвет  и  скорость: " + mazda.color + "  " + mazda.speed);
    }

    static class Car {
        public String color;
        public int speed;

        public void drive()
        {
            System.out.println("Машина едет");
        }


    }
}