package L04_Interfaces_and_Abstraction.exercise.P07CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private int maxSize;
    private List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
        this.maxSize = 100;
    }

    public List<String> getItems() {
        return items;
    }
}
