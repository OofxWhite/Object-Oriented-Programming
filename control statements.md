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

Methods define the **behavior** of the class. They can perform actions, manipulate data, or provide information about the object's state.  
Methods are defined within the class and can be called on objects created from that class.

```java
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
```

### Constructors:

Constructors are special methods in a class used to initialize objects in said class.
- Constructors have no return type(not even void).
- called automatically when the keyword `new` is used.

#### Initializing Constructors:
-Constructors must hold the same name as the class its in.
```java
public class constructor{
    constructor()
}
```
