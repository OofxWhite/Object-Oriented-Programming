public interface Series {
    int getNext();    // Get the next number in the series
    void reset();     // Reset the series
    void setStart(int start); // Set the starting value of the series
}

public class ByTwos implements Series {
    private int currentValue;

    public ByTwos() {
        this.currentValue = 0; // Default starting value is 0
    }

    @Override
    public int getNext() {
        int nextValue = currentValue;
        currentValue += 2; // Increment by 2 for the next value
        return nextValue;
    }

    @Override
    public void reset() {
        currentValue = 0; // Reset the series to the starting value
    }

    @Override
    public void setStart(int start) {
        currentValue = start; // Set a new starting value for the series
    }
}

public class SeriesDemo {
    public static void main(String[] args) {
        Series series = new ByTwos(); // Create an instance of ByTwos

        // Generate and display the next 5 numbers in the series
        for (int i = 0; i < 5; i++) {
            int nextValue = series.getNext();
            System.out.println("Next Value: " + nextValue);
        }

        // Reset the series
        series.reset();
        System.out.println("Series Reset.");

        // Set a new starting value
        series.setStart(10);

        // Generate and display the next 5 numbers in the series
        for (int i = 0; i < 5; i++) {
            int nextValue = series.getNext();
            System.out.println("Next Value: " + nextValue);
        }
    }
}
