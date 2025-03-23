//Создайте ArrayList строк и добавьте в него 5 имен, выведите их.
//Используйте HashMap для хранения пар "имя-возраст" и найдите возраст по имени.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();
        name.add("Denis");
        name.add("Vasy");
        name.add("Tanya");
        name.add("Nusha");
        name.add("Roman");

        System.out.println(name);

        for (String n : name)
            {
                System.out.println(n);
            }
    Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Denis",37);
        map.put("Vasy",27);
        map.put("Tanya",32);
        map.put("Roman",17);


        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.printf("Key: %s  Value: %d \n", item.getKey(), item.getValue());

    }
}
}