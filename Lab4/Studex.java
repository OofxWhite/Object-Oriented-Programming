import java.util.Scanner;

class STUDENT {
    String sname;
    int marks[];

    STUDENT() {
        System.out.println("Inside zero argument constructor");
    }

    STUDENT(String name, int m[]) {
        System.out.println("Inside parameterized constructor");
        sname = name;
        marks = m.clone();
    }

    void display() {
        System.out.println("Student name: "+sname);
        if (marks != null) {
            for (int x: marks) {
                System.out.println(x);
            }
        }
    }
}

public class Studex {
    public static void main(String[] args) {
        STUDENT s1 = new STUDENT();
        s1.display();
        int marks[] = {223,762};
        STUDENT s2 = new STUDENT("Melly", marks);
        s2.display();
    }
}
