import java.util.Scanner;

class COUNTER {
    static int count = 0;

    
    COUNTER() {
        System.out.println("Inside zero argument constructor");
        count += 1;
    }

    static void showCount() {
        System.out.println("Count is : "+count);
    }
}

public class ex4 {
    public static void main(String[] args) {
        for (int i=0; i<4; i++) {
            COUNTER s = new COUNTER();
        }

        COUNTER.showCount();
    }
}