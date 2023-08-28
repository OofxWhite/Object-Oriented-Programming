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
   - Parameterized constructors allow you to pass values during object creation to initialize the object's fields. 
     - They take parameters that correspond to the fields' values and set them accordingly.

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
   - Like other methods, constructors can be overloaded. This means you can define **multiple** constructors in a class with different parameter lists. 
     - Java will choose the appropriate constructor based on the arguments you provide during object creation.

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
   - In addition to constructor parameters, you can also include code blocks within constructors to perform additional initialization tasks.

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
  -  Constructors can <mark>call other constructors within the same class </mark>  using the `this()` keyword. 
     -  This technique is called constructor chaining and allows you to reuse initialization code.

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
   ---

   ## Methods:
   **Definition:**
   - Methods are blocks of code that performs tasks and can be invoked from other parts of the program.

### 1. Declaration: 
General form:
return-type name(parameters){ }

- Return type indicates the type of vlaue returned by the method.
  - no value will be returned if the return type is `void`.
  
  Example:
```java
  public int add(int a, int b) {
    int sum = a + b;
    return sum;
}

public void printMessage(String message) {
    System.out.println(message);
}
```

### 2. Invocation:
- Methods are invoked by their name().
    - parameters of the methods go as arguments in the ().
  
### 3. Parameters and Arguments:
- Parameters are **variables** declared in the method signature that accepts values to the method.
- Arguments are the **actual values** that are given when invoking the method.
 
 ```java
 // Method declaration with parameters
public void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

// Method invocation with an argument
greet("Glokk"); // The string "Glokk" is the argument.
 ```

### 4. Overloading:
- Multiple methods can be defined with the same name but diff parameters.
- Java determiines the best fit method to be called based on the paramters and arguments used in invocation.

### 5. Access Modifiers:
- Used to restric scope of a class,method etc.

#### 4 types of Access modifiers:
##### 1. Default:
- when no access modifier is specified it has the default access modifier.
  - This allowes access anywhwere within the same package.
Example:
```java
// Java program to illustrate default modifier
package p1;

// Class Geek is having Default access modifier
class Geek
{
	void display()
	{
		System.out.println("Hello World!");
	}
}
```
##### 2. Private:
- Methods or data declared private are only accesible within the class in which theyre declared.
  - Top level classes cant be declared private as
    - private means only visible within the enclosing class.
  
##### 3. Protected:
- Methods and data are only accesible within the same package or subclasses in diff packages.
- Keyword: Protected

###### Access within the Same Class:
- A protected member can be accessed directly within the class it belongs to, just like any other member with public or private access.

###### Access within Subclasses:
- A protected member can be accessed by subclasses (classes that inherit from the class containing the protected member), regardless of whether the subclasses are in the same package or different packages.

###### Access in the Same Package:
- A protected member can also be accessed by any class within the same package, regardless of whether the accessing class is a subclass.

###### Access in Different Packages:
- If a subclass is in a different package, it can still access the protected members of its superclass. 
- Other classes in different packages cannot access protected members unless they are subclasses of the class containing the protected member.

##### 4. Public:
Keyword: Public
- Classes Methods data are accessible from anywhere in the program without restrictions.



