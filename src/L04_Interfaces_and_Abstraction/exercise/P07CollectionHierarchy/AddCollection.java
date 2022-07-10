package L04_Interfaces_and_Abstraction.exercise.P07CollectionHierarchy;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String item) {
        super.getItems().add(item);
        return super.getItems().indexOf(item);
    }
}
