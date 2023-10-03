import java.util.Scanner;

class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class CurrentDate {
    private int day;
    private int month;
    private int year;

    public CurrentDate() {
        day = 0;
        month = 0;
        year = 0;
    }

    public void createDate() throws InvalidDayException, InvalidMonthException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        day = input.nextInt();
        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter year: ");
        year = input.nextInt();

        input.close();

        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        }

        if (day < 1 || day > 31) {
            throw new InvalidDayException("Invalid day: " + day);
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            throw new InvalidDayException("Invalid day for the given month: " + day);
        }

        if (month == 2) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if ((day > 29 && isLeapYear) || (day > 28 && !isLeapYear)) {
                throw new InvalidDayException("Invalid day for February in the given year: " + day);
            }
        }

        System.out.println("Current Date: " + day + "/" + month + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        CurrentDate currentDate = new CurrentDate();

        try {
            currentDate.createDate();
        } catch (InvalidDayException | InvalidMonthException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
