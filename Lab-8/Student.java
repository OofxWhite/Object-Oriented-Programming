public class Student {

    private String name;
    private String registrationNumber;
    private String email;
    private int yearOfJoining;

    public Student(String name, String registrationNumber, String email, int yearOfJoining) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.email = email;
        this.yearOfJoining = yearOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public static class SeatsFilledException extends Exception {

        public SeatsFilledException(String message) {
            super(message);
        }
    }

    public void register() throws SeatsFilledException {
        if (Integer.parseInt(registrationNumber.substring(2)) > yearOfJoining % 100 + 25) {
            throw new SeatsFilledException("All seats are filled for the year " + yearOfJoining);
        }
    }
}

