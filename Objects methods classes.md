# Classes Objects Methods

## Fundamentals:
 - Classes are **templates**  that specify how objects are built.  
 - Classes can be used to create any no of objects of the **same form**  but different data.  
  - Objects are instances of a  class that contains attributes and methods.
    - Attributes can be defines as characteristics of the object.
    - Methods can be defined as the actions the object can do.
---

### Class Declaration:
A class is declared using the class keyword, followed by the class name. It is the foundation for creating objects of that class type.

```java
public class MyClass {
    // Class members (fields and methods) will be defined here.
}
```
---
### Fields (Attributes/Instance Variables):

Fields are variables that hold the **state or data** of an object. They represent the characteristics or properties of the class. Fields are defined within the class but outside any method.

```java
public class Person {
    String name;
    int age;
}
```
---

### Methods (Member Functions):

- Methods define the **behavior** of the class. They can perform actions, manipulate data, or   provide information about the object's state.  
- Methods are defined within the class and can be called on objects created from that class.

```java
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
```
---

### Constructors:

Constructors are special methods in a class used to initialize objects in said class.
- Constructors have no return type(not even void).
- called automatically when the keyword `new` is used.

1. **Default Constructor:**
  - If you don't define any constructors for a class, Java provides a default constructor with no arguments. This default constructor initializes fields to their default values (e.g., `0`, `null`, `false`, etc.).

   ```java
   public class MyClass {
       // Default constructor provided by Java if not defined explicitly
   }
   ```

2. **Parameterized Constructors:**
   - Parameterized constructors allow you to pass values during object creation to initialize the object's fields. They take parameters that correspond to the fields' values and set them accordingly.

   ```java
   public class Person {
       String name;
       int age;

       // Parameterized constructor
       public Person(String personName, int personAge) {
           name = personName;
           age = personAge;
       }
   }
   ```

3. **Overloading Constructors:**
   - Like other methods, constructors can be overloaded. This means you can define **multiple** constructors in a class with different parameter lists. Java will choose the appropriate constructor based on the arguments you provide during object creation.

   ```java
   public class Rectangle {
       int width;
       int height;

       // Constructor with different parameter lists
       public Rectangle(int w, int h) {
           width = w;
           height = h;
       }

       public Rectangle(int sideLength) {
           width = sideLength;
           height = sideLength;
       }
   }
   ```

4. **Initializing Code Blocks:**  
   - In addition to constructor parameters, you can also include code blocks within constructors to perform additional initialization tasks. These code blocks are executed before the constructor body.

   ```java
   public class Student {
       String name;
       int age;

       // Constructor with initialization block
       public Student(String studentName, int studentAge) {
           {
               // Initialization block
               name = studentName;
               age = studentAge;
           }
           // Constructor body can follow
       }
   }
   ```

5. **Chaining Constructors (Constructor Overloading):**  
  -  Constructors can <mark>call other constructors within the same class</mark> using the `this()` keyword. This technique is called constructor chaining and allows you to reuse initialization code.

   ```java
   public class Car {
       String model;
       int year;

       public Car() {
           this("Unknown", 0); // Call the parameterized constructor
       }

       public Car(String carModel, int carYear) {
           model = carModel;
           year = carYear;
       }
   }
   ```