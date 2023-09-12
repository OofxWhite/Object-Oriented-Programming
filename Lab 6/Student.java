class Student {
    private String name;
    private int rollNumber;
    private int marks1;
    private int marks2;
    private double totalMarks;
    private double averageMarks;

    public Student(String name, int rollNumber, int marks1, int marks2) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.totalMarks = 0;
        this.averageMarks = 0;
    }

    public void compute() {
        totalMarks = marks1 + marks2;
        averageMarks = totalMarks / 2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

class ScienceStudent extends Student {
    private int practicalMarks;

    public ScienceStudent(String name, int rollNumber, int marks1, int marks2, int practicalMarks) {
        super(name, rollNumber, marks1, marks2);
        this.practicalMarks = practicalMarks;
    }

    @Override
    public void compute() {
        super.compute();
        totalMarks += practicalMarks;
        averageMarks = totalMarks / 3;
    }

    public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

class ArtsStudent extends Student {
    private String electiveSubject;

    public ArtsStudent(String name, int rollNumber, int marks1, int marks2, String electiveSubject) {
        super(name, rollNumber, marks1, marks2);
        this.electiveSubject = electiveSubject;
    }

    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 101, 85, 90);
        student.compute();
        student.display();

        ScienceStudent scienceStudent = new ScienceStudent("Alice", 102, 90, 95, 88);
        scienceStudent.compute();
        scienceStudent.display();
        scienceStudent.displayPracticalMarks();

        ArtsStudent artsStudent = new ArtsStudent("Bob", 103, 78, 88, "History");
        artsStudent.compute();
        artsStudent.display();
        artsStudent.displayElectiveSubject();
    }
}
