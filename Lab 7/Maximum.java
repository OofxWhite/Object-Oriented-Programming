package myPackages.p1;

public class Maximum {
    // Find maximum among three integers
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Find maximum among three floating-point numbers
    public static double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    // Find maximum in an array of integers
    public static int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Find maximum in a matrix (2D array) of integers
    public static int max(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }

        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
}
