import myPackages.p1.Maximum;

public class Main {
    public static void main(String[] args) {
        int maxInt = Maximum.max(5, 10, 3);
        System.out.println("Maximum integer: " + maxInt);

        double maxDouble = Maximum.max(3.5, 1.2, 7.8);
        System.out.println("Maximum double: " + maxDouble);

        int[] intArray = { 7, 2, 9, 1, 5 };
        int maxInArray = Maximum.max(intArray);
        System.out.println("Maximum in the array: " + maxInArray);

        int[][] matrix = { { 2, 5, 8 }, { 1, 6, 3 }, { 7, 4, 9 } };
        int maxInMatrix = Maximum.max(matrix);
        System.out.println("Maximum in the matrix: " + maxInMatrix);
    }
}
