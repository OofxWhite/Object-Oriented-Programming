import java.util.Scanner;

public class Employee {
    private String fname;
    private String lname;

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String formatEmployeeName() {
        String[] firstWords = fname.split(" ");
        String[] lastWords = lname.split(" ");

        StringBuilder formatfname = new StringBuilder();
        for (String word : firstWords) {
            if (!formatfname.toString().isEmpty()) {
                formatfname.append(" ");
            }
            formatfname.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
        }

        StringBuilder formatlname = new StringBuilder();
        for (String word : lastWords) {
            if (!formatlname.toString().isEmpty()) {
                formatlname.append(" ");
            }
            formatlname.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
        }

        return formatfname.toString() + " " + formatlname.toString();
    }

    public String generateEmail() {
        String formattedName = formatEmployeeName().replace(" ", ".").toLowerCase();
        return formattedName + "@idksomething.com";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of entries: ");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.print("Enter first name and last name (separated by a space): ");
            String[] nameParts = scanner.nextLine().split(" ");
            
            if (nameParts.length == 2) {
                Employee employee = new Employee(nameParts[0], nameParts[1]);
                String formattedName = employee.formatEmployeeName();
                String email = employee.generateEmail();
                System.out.println("Formatted Name: " + formattedName);
                System.out.println("Email Address: " + email);
            } else {
                System.out.println("Invalid input. Please enter both first name and last name separated by a space.");
            }
        }

        scanner.close();
    }
}

