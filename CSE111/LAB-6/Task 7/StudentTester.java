public class StudentTester {
    public static void main(String[] args) {
        // Printing details before creating any students
        Student.printDetails();
        System.out.println("--------------------");

        // Creating the first student "Mikasa"
        Student mikasa = new Student("Mikasa", 3.75);
        mikasa.individualDetail();
        System.out.println("--------------------");

        // Printing details after creating Mikasa
        Student.printDetails();
        System.out.println("--------------------");

        // Creating the second student "Harry"
        Student harry = new Student("Harry", 2.5, "Charms");
        harry.individualDetail();
        System.out.println("--------------------");

        // Printing details after creating Harry
        Student.printDetails();
        System.out.println("--------------------");

        // Creating the third student "Levi"
        Student levi = new Student("Levi", 3.33);
        levi.individualDetail();
        System.out.println("--------------------");

        // Printing final details
        Student.printDetails();
    }
}
