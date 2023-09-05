import java.util.Scanner;

public class commas {
    public static String addCommasToNumber(String input) {
        if (input == null || input.isEmpty()) {
            return "Invalid input";
        }

        input = input.replaceAll(",", "").trim();

        if (!input.matches("\\d+")) {
            return "Invalid number format";
        }

        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            result.insert(0, input.charAt(i));
            count++;
            if (count % 3 == 0 && i > 0) {
                result.insert(0, ",");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String inputNumber = scanner.nextLine();

        String Commas = addCommasToNumber(inputNumber);

        System.out.println("Input: " + inputNumber);
        System.out.println("Output: " + Commas);

        scanner.close();
    }
}

