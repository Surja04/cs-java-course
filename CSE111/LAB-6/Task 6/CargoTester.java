public class CargoTester {
    public static void main(String[] args) {
        // Display the initial cargo capacity
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("1====================");

        // Creating the first cargo "Industrial Machinery"
        Cargo a = new Cargo("Industrial Machinery", 4.5);
        a.details();
        System.out.println("2====================");

        // Loading the first cargo
        a.load();
        System.out.println("3====================");

        // Creating the second cargo "Steel Ingot"
        Cargo b = new Cargo("Steel Ingot", 2.7);
        b.details();
        System.out.println("4====================");

        // Display the updated cargo capacity
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("5====================");
//
        // Loading the second cargo
        b.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("6====================");

        // Creating the third cargo "Tree Trunks"
        Cargo c = new Cargo("Tree Trunks", 3.6);
        c.load();
        System.out.println("7====================");

        // Displaying details of the third and second cargo
        c.details();
        b.details();
        System.out.println("8====================");

        // Creating the fourth cargo "Processed Goods"
        Cargo d = new Cargo("Processed Goods", 1.8);
        d.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("9====================");

        // Unloading the second cargo
        b.unload();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("10====================");

        // Attempting to load the third cargo again
        c.load();
        System.out.println("11====================");

        // Displaying details of the second cargo
        b.details();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
    }
}
