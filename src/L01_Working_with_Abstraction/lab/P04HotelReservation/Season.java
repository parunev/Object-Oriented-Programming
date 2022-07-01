package L01_Working_with_Abstraction.lab.P04HotelReservation;

public enum Season {
    Spring(2),
    Summer(4),
    Autumn(1),
    Winter(3);

    private int value;
    Season(int value) {this.value = value;}
    public int getValue() {return this.value;}
}
