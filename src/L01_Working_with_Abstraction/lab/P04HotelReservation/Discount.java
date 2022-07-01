package L01_Working_with_Abstraction.lab.P04HotelReservation;

public enum Discount {

    None(0),
    SecondVisit(10),
    VIP(20);

    private int value;
    Discount(int value) {this.value = value;}
    public int getValue() {return this.value;}
}
