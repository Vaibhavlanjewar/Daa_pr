import java.util.*;

class Item implements Comparable<Item> {
    int weight;
    int value;
    double ratio;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (double)value / (double)weight;
    }

    @Override
    public int compareTo(Item other) {
        // Sort items in non-increasing order of value-to-weight ratio
        if (this.ratio < other.ratio)
            return 1;
        else if (this.ratio > other.ratio)
            return -1;
        else
            return 0;
    }
}

public class FractionalKnapsack {

    public static double fractionalKnapsack(int capacity, List<Item> items) {
        Collections.sort(items); // Sort items based on value-to-weight ratio

        double totalValue = 0;
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (remainingCapacity >= item.weight) {
                // Take the whole item
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                // Take fraction of the item
                double fraction = (double) remainingCapacity / (double) item.weight;
                totalValue += fraction * item.value;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(10, 60));
        items.add(new Item(20, 100));
        items.add(new Item(30, 120));

        int capacity = 50;
        double maxValue = fractionalKnapsack(capacity, items);
        System.out.println("Maximum value that can be obtained = " + maxValue);
    }
}
