class Building{ //The Building class contains fields for square footage and stories
    private int sqft;
    private int stories;

    public Building(int sqft, int stories){
        this.sqft = sqft;
        this.stories = stories;
    }

    public int getsqft(){
        return sqft;
    }

    public void setsqft(int sqft){
        this.sqft = sqft;
    }

    public int getstories(){
        return stories;
    }

    public void setstories(int stories){
        this.stories = stories;
    }
}

class House extends Building{//House class contains additional fields for number of bedrooms and baths
    private int bedroom;
    private int bath;

    public House(int sqft, int stories, int bedroom, int bath){
        super(sqft,stories);
        this.bedroom =  bedroom;
        this.bath = bath;
    }

    public int getbedroom(){
        return bedroom;
    }

    public void setbedroom(int bedroom){
        this.bedroom = bedroom;
    } 

    public int getbath(){
        return bath;
    }

    public void setbath(int bath){
        this.bath = bath;
    }   
}

class School extends Building{// class contains fields for classroom and grade
    private int clroom;
    private int grade;

    public School(int sqft, int stories, int clroom, int grade){
        super(sqft, stories);
        this.clroom = clroom;
        this.grade = grade;
    }

    public int getclroom(){
        return clroom;
    }

    public int setclroom(int clroom){
        this.clroom = clroom;
    }

    public int getgrade(){
        return grade;
    }

    public int setgrade(int grade){
        this.grade = grade;
    }
}

public class Community{
    public static void main(String[] args){
        Building building = new Building(4000,3);
        System.out.println("Building area is " + building.getsqft());
        System.out.println("Building is " + building.getstories() + "tall");

        System.out.println("------------------------------");

        House house = new House(3000,1,2,3);
        System.out.println("House area is " + house.getsqft());
        System.out.println("House Stories: " + house.getstories());
        System.out.println("House Bedrooms: " + house.getbedroom());
        System.out.println("House Baths: " + house.getbath());

        System.out.println();

        School school= new School(5000, 3, 10, 9);
        System.out.println("School Square Footage: " + school.getsqft());
        System.out.println("School Stories: " + school.getstories());
        System.out.println("School Classrooms: " + school.getclroom());
        System.out.println("School Grade Level: " + school.getgrade());



    }
}
