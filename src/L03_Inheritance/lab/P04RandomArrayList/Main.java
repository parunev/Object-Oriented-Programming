package L03_Inheritance.lab.P04RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();

        for (int i = 1; i <= 10; i++) {
            randomArrayList.add(i);}

        System.out.println(randomArrayList.getRandomElement());
    }
}
