import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    int Basic;

    void read(String name, int id, int basic) {
        Ename = name;
        Eid = id;
        Basic = basic;
    }

    void display() {
        System.out.println("Employee name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Basic salary: " + Basic);
    }

    double compute_net_sal() {
        double total = Basic * (1 + 0.52) * 0.70;
        return total;
    }
}

class FullTimeEmp extends EMPLOYEE {
    double bonus;
    double deductions;

    @Override
    double compute_net_sal() {
        double total = Basic * (1 + 0.52) * 0.70 + bonus - deductions;
        return total;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Employee bonus: " + bonus);
        System.out.println("Employee deductions: " + deductions);
    }
}

class PartTimeEmp extends EMPLOYEE {
    int hoursWorked;
    static final double hourlyRate = 10.0;

    @Override
    double compute_net_sal() {
        double total = hoursWorked * hourlyRate;
        return total;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Employee hours worked: " + hoursWorked);
        System.out.println("Employee hourly rate: " + hourlyRate);
    }
}

public class Empagain {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        n = sc.nextInt();
        sc.nextLine();
        EMPLOYEE[] e = new EMPLOYEE[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of employee " + i);
            String name = sc.nextLine();
            System.out.println("Enter ID of employee " + i);
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter basic salary of employee " + i);
            int basic = sc.nextInt();
            sc.nextLine();
            System.out.println("Is the employee full-time or part-time? (F/P)");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("F")) {
                e[i] = new FullTimeEmp();
                System.out.println("Enter bonus for employee " + i);
                double bonus = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter deductions for employee " + i);
                double deductions = sc.nextDouble();
                sc.nextLine();
                ((FullTimeEmp) e[i]).bonus = bonus;
                ((FullTimeEmp) e[i]).deductions = deductions;
                
            } else if (type.equalsIgnoreCase("P")) {
                e[i] = new PartTimeEmp();
                System.out.println("Enter hours worked for employee " + i);
                int hoursWorked = sc.nextInt();
                sc.nextLine();
                ((PartTimeEmp) e[i]).hoursWorked = hoursWorked;
            }
            e[i].read(name, id, basic);
            e[i].display();
            double total = e[i].compute_net_sal();
            System.out.println("Net Salary for employee " + i + ": " + total);
        }
    }
}
