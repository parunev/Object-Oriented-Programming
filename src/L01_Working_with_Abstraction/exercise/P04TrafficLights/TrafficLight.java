package L01_Working_with_Abstraction.exercise.P04TrafficLights;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {this.color = color;}

    public void changeColor() {

        switch (this.color) {
            case RED: this.color = Color.GREEN; break;
            case GREEN: this.color = Color.YELLOW; break;
            case YELLOW: this.color = Color.RED; break;
        }
    }

    @Override
    public String toString() {return this.color.toString();}
}
