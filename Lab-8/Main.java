
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "XX2301", "alice@example.com", 2023);
        Student student2 = new Student("Bob", "XX2302", "bob@example.com", 2023);

        try {
            student1.register();
            student2.register();
        } catch (SeatsFilledException e) {
            System.out.println(e.getMessage());
        }
    }
}

