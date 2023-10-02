public interface Sports {
    void putGrade();
}

public class Student {
    private int rollNo;
    private int marks;

    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void putRollNo() {
        System.out.println("Roll No: " + rollNo);
    }

    public int getMarks() {
        return marks;
    }

    public void putMarks() {
        System.out.println("Marks Obtained: " + marks);
    }
}

public class Result extends Student implements Sports {
    private char sportsGrade;

    public Result(int rollNo, int marks, char sportsGrade) {
        super(rollNo, marks);
        this.sportsGrade = sportsGrade;
    }

    @Override
    public void putGrade() {
        System.out.println("Sports Grade: " + sportsGrade);
    }

    public void generateResult() {
        putRollNo();
        putMarks();
        putGrade();
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, 85);
        Result result = new Result(102, 78, 'B');

        System.out.println("Student Details:");
        student.putRollNo();
        student.putMarks();

        System.out.println("\nResult Details:");
        result.generateResult();
    }
}
