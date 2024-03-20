public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color color;
    private boolean capOn;

    public Pen() {
        this(Color.RED); // Default color is red
    }

    public Pen(Color color) {
        this.color = color;
        this.capOn = true; // Cap is initially on
    }

    public void capOn() {
        capOn = true;
    }

    public void capOff() {
        capOn = false;
    }

    public void changeColor(Color newColor) {
        if (!capOn) {
            color = newColor;
        }
    }

    public String draw() {
        if (capOn) {
            return "";
        } else {
            return "Drawing " + color;
        }
    }
}
