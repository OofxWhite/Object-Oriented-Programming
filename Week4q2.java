import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    int Basic;

    EMPLOYEE() {
        System.out.println("Inside zero argument constructor");
    }

    EMPLOYEE(String name, int id, int b) {
        System.out.println("Inside parameterized constructor");
        Ename = name;
        Eid = id;
        Basic = b;
    }

    void display() {
        System.out.println("Employee name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Salary: " + Basic);
    }
}

public class ex2 {
    public static void main(String[] args) {
        EMPLOYEE s1 = new EMPLOYEE();
        s1.display();
        EMPLOYEE s2 = new EMPLOYEE("Haider", 1, 1000);
        s2.display();
    }
}