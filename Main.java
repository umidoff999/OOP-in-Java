package Interface;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Person person = new Person("Bobur", "Samarqand");
        System.out.println(person);

        Student student = new Student("Suxrob", "Toshkent", "Hystory of countries", 2023, 5000.0);
        System.out.println(student);

        Staff staff = new Staff("Ali", "Andijon", "145th school", 600000.0);
        System.out.println(staff);
    }
}
