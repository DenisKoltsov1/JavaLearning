// Создайте класс Animal и подкласс Dog, унаследуйте поле name.
// Добавьте в Dog метод bark(), который выводит "Гав!".
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Pivi");
        dog1.bark();
        System.out.println(dog1.getName());
    }

    static class Animal {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    
    public static class Dog extends Animal {
        public void bark() {
            System.out.println("Гав!");
        }
    }
}