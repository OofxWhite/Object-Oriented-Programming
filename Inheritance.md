# Inheritance
- [Inheritance](#inheritance)
    - [Introduction](#introduction)
    - [Need for Inheritance:](#need-for-inheritance)
      - [1. **Single Inheritance:**](#1-single-inheritance)
      - [2.**Multilevel Inheritance:**](#2multilevel-inheritance)
      - [3.**Heirarchical Inheritance:**](#3heirarchical-inheritance)
    - [Polymorphism](#polymorphism)

---
### Introduction
**Definition:** Inheritance is a mechanism in which one class is allowed to inherit the features of another class.   
A subclass inherits all the instance variables and methods from the superclass and adds its own unique elements.   

### Need for Inheritance:
1. **Reusability:** Code in the superclass is common to all subclasses. Subclass can directly access the superclass code.
2. **Abstaraction:** Abstract where we do not need to provide all the info is achieved only through inheritance.*Abstraction* only shows the functionality to the user.  

>  <details>
>  <summary>⚡Terminologies used in inheritance</summary>
> 
>   - **Class:** Set of objects which share common attributes and behavior.  
>     It is just a template or blueprint from which objects are created.  
>   - **Superclass:** Class whose features are inherited by the subclasses.  
>    might be also reffered to as parent class.
>   - **Subclass:** Class who inherits the other class.  
>     Subclasses can add their own fields and methods in addition to superclass features.
>   - **Final:** Doesnt allow other classes to inherit from said class.
>   - **Super:** The keyword super can be used to access any data member or methods of the parent class.(works atvariable, method and constructor level.)
>  </details>
---
- Inheritance in  java is initialized by the keyword `extends`.
  ```java
  class Subclass_name extends Superclass_name{
    //body
  }
  ```
There are multiple types of inheritances supported by java
 #### 1. **Single Inheritance:**  
 - Simply said when one class inherits another class its said to be **single** inheritance.
  ![Alt text](image.png)   

```java
  class Animal{  
  void eat(){System.out.println("eating...");}  
  }  
  class Dog extends Animal{  
  void bark(){System.out.println("barking...");}  
  }  
  class TestInheritance{  
  public static void main(String args[]){  
  Dog d=new Dog();  
  d.bark();  
  d.eat();  
  }}
``` 
#### 2.**Multilevel Inheritance:** 
- In Multilevel Inheritance, one class can inherit from a derived class.
  - Hence, the <u> derived class becomes the base class for the new class.</u>  
![Multilevel](https://www.guru99.com/images/java/multilevel.png)   
```java
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}
```
#### 3.**Heirarchical Inheritance:**  
- The type of inheritance where <u>many subclasses inherit from one single class.</u> 
- It is different from the multilevel inheritance, as the multiple classes are being derived from one superclass. 
  - These newly derived classes inherit the features, methods, etc, from this one superclass. This process facilitates the reusability of a code and dynamic polymorphism (method overriding).
![Heirarchial](https://www.guru99.com/images/java/hierarchy.png)  
```java
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();   
}} 
```
### Polymorphism
**Definition:** The same entity (method or operator or object) can perform different operations in different scenarios.   

```java
class Polygon {

  // method to render a shape
  public void render() {
    System.out.println("Rendering Polygon...");
  }
}

class Square extends Polygon {

  // renders Square
  public void render() {
    System.out.println("Rendering Square...");
  }
}

class Circle extends Polygon {

  // renders circle
  public void render() {
    System.out.println("Rendering Circle...");
  }
}

class Main {
  public static void main(String[] args) {
    
    // create an object of Square
    Square s1 = new Square();
    s1.render();

    // create an object of Circle
    Circle c1 = new Circle();
    c1.render();
  }
}
```
- Polymorphism allows us to create consistent code. In the previous example, we can also create different methods: `renderSquare()` and `renderCircle()` to render `Square` and `Circle`, respectively.
- polymorphism in Java allows us to create a single method `render()` that will behave differently for different shapes.
>💡  `print()` is also a form of polymorphism. It is used to print diff types of values.

---
> ⚡For the ones in a hurry summary videos below(20min):  
> [Inheritance(6min)](https://youtu.be/Zs342ePFvRI)  
> [Super(8min)](https://youtu.be/oKZnHNM9Ew4)  
> [Polymorphism(6min)](https://youtu.be/2hkngtWLGvE)
