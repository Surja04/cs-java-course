public class RealNumber {
    public double realValue;

    // Default constructor
    public RealNumber() {
        this(0.0);
    }

    // Parameterized constructor
    public RealNumber(double realValue) {
        this.realValue = realValue;
    }

    // Method to return the string representation
    public String toString() {
        return "RealPart: " + realValue;
    }
}
