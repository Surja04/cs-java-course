public class Phy2 {
    public static void main(String[] args) {
        int distanceInMeters = 1669; // Assuming the last 4 digits of your student ID are 1669
        int timeInSeconds = (5 * 3600) + (56 * 60) + 23; // Total time in seconds

        // Convert distance to kilometers
        double distanceInKilometers = distanceInMeters / 1000.0;

        // Convert time to hours
        double timeInHours = timeInSeconds / 3600.0;

        // Calculate velocity in km/h
        double velocityKmph = distanceInKilometers / timeInHours;

        // Convert meters to miles (1 mile = 1609 meters)
        double distanceInMiles = distanceInMeters / 1609.0;

        // Calculate velocity in mph
        double velocityMph = distanceInMiles / timeInHours;

        // Display results
        System.out.printf("Your velocity in km/h is %.7f%n", velocityKmph);
        System.out.printf("Your velocity in miles/h is %.7f%n", velocityMph);
    }
}