package L04_Interfaces_and_Abstraction.exercise.P07CollectionHierarchy;

public class MyListImpl extends Collection implements MyList {

    @Override
    public String remove() {
        return super.getItems().remove(0);
    }

    @Override
    public int add(String item) {
        super.getItems().add(0, item);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
