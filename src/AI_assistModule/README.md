package AI_assistModule;

public class Calculator {
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
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        calculator.add(15);
        System.out.println("The sum is: " + calculator.getValue());
        calculator.reset();
        System.out.println("After reset, the value is: " + calculator.getValue());
    }
}
The provided code defines a simple `Calculator` class in Java, which is part of the `AI_assistModule` package. The `Calculator` class has a private integer field `value` that is used to store the result of calculations.

The class provides three methods:

1. `reset()`: This method sets the `value` field to 0.
2. `add(int number)`: This method adds the provided integer to the current `value`.
3. `getValue()`: This method returns the current `value`.

The `main` method in the class creates an instance of the `Calculator`, 
adds the numbers 5, 10, and 15 to the `value` using the `add` method, 
and then prints the sum. After that, it resets the `value` to 0 using the 
`reset` method and prints the value again.