//Сделайте поля класса Car приватными, добавьте геттеры и сеттеры.

public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        mazda.setColor("Black");  ;
        mazda.setSpeed(256);

        mazda.drive();
        System.out.println("Цвет  и  скорость: " + mazda.getColor()+ "  " + mazda.getSpeed());
    }

    static class Car {
        private String color;
        private int speed;

        public void setColor(String color) {
            this.color = color;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public String getColor() {
            return color;
        }

        public int getSpeed() {
            return speed;
        }

        public void drive()
        {
            System.out.println("Машина едет");
        }


    }
}