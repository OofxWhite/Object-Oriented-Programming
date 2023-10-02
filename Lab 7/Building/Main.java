import com.course.structure.Building;
import com.course.structure.House;
import com.course.structure.School;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Generic Building", "123 Main St.");
        House house = new House("Cozy Home", "456 Elm St.", 3);
        School school = new School("Elementary School", "789 Oak St.", 10);

        System.out.println(building);
        System.out.println();
        System.out.println(house);
        System.out.println();
        System.out.println(school);
    }
}
