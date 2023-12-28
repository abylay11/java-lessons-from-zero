import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Collections in Java
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);

//        numbers.clear();

        for (Integer el : numbers) {
            System.out.println(el);
        }

        // Linked List
        LinkedList<Float> numbers2 = new LinkedList<>();
        numbers2.add(5.6f);
        numbers2.add(15.6f);
        numbers2.add(17.6f);

        for (Float el: numbers2) {
            System.out.println(el);
        }
    }
}