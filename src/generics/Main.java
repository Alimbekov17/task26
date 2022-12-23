package generics;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Box<List<Integer>> integerBox = new Box<>(List.of(1, 2, 3, 4, 5));
        System.out.println(Box.getBox(integerBox));
        Box<String> stringBox = new Box<>("Hello World!");
        System.out.println(Box.getBox(stringBox));
        Map<Integer, String> map = new HashMap<>();
        map.put(8, "Java");
        Box<Map<Integer, String>> mapBox = new Box<>(map);
        for (Map.Entry<Integer, String> entry : Box.getBox(mapBox).getE().entrySet()) {
            System.out.println(entry.getValue() + "-" + entry.getKey());
        }
    }
}