package AI_assistModule;

public class Model {
    private int value;

    public void reset() {
        this.value = 0;
    }

    public void add(int number) {
        this.value += number;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Model calculator = new Model();
        calculator.add(5);
        calculator.add(10);
        calculator.add(15);
        System.out.println("The sum is: " + calculator.getValue());
        calculator.reset();
        System.out.println("After reset, the value is: " + calculator.getValue());
    }
}