import java.util.Iterator;
import java.util.Stack;
import java.util.List;
import java.util.Collections;

public class LoopCollection2 {
    public static void main(String[] args) {
        List<String> fruits = new Stack<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        ((Stack<String>) fruits).push("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!((Stack<String>) fruits).empty()) {
            System.out.printf("%s ", ((Stack<String>) fruits).pop());
        }

        ((Stack<String>) fruits).push("Melon");
        ((Stack<String>) fruits).push("Durian");
        System.out.println("");

        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });

        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        fruits.set(fruits.size() - 1, "Strawberry");

        ((Stack<String>) fruits).push("Mango");
        ((Stack<String>) fruits).push("guava");
        ((Stack<String>) fruits).push("avocado");
        Collections.sort(fruits);

        System.out.println("\nFruits after sorting:");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
    }
}
