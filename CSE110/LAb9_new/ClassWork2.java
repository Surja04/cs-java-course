import java.util.*;

public class ClassWork2 {
    public static void main(String[] args) {
        // Part A: Circle Area
        double area = circleArea(5);
        System.out.printf("Circle Area: %.4f\n", area);

        // Part B: Sphere Volume
        double volume = sphereVolume(5);
        System.out.printf("Sphere Volume: %.4f\n", volume);
    }

    // Method for Part A
    public static double circleArea(int radius) {
        return Math.PI * radius * radius;
    }

    // Method for Part B
    public static double sphereVolume(int radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
