## Classes and Objects
- **Class:** A user-defined data type that acts as a blueprint or template for creating objects. It defines the state (attributes) and behavior (methods) that the objects of the class will share.
- **Object:** An instance of a class. It is a runtime entity that has a state and behavior, occupying memory in the heap.
```Java
class Pen{
	String color;
	String type;
	
	public void write(){
		System.out.println("Write");
	}
	public void printColor(){
		// 'this' refers to the current object calling this method
		System.out.println(this.color)
	}
}

public class OOPS{
	public static void main(String args[]){
		Pen pen1 = new Pen(); //object of class Pen
		pen1.color = "blue"; //accessing properties
		pen1.type = "gel";
		
		pen1.write(); //will print pen1's color, 'this' keyword used
		
		Pen pen2 = new Pen(); //object of class Pen
		pen2.color = "red"; //properties
		pen2.type = "dot";
		
		pen2.write();
	}
}
```
## Common Keywords
- What is a function inside a class called?
	- Method
- Class defines the blueprint for an object
	- e.g. Pen defines the blueprint
- Variables inside the class
	- Properties, i.e. color, type
	- Properties, i.e. variable inside the parent class is defined by using `.`
	- Similarly, methods are also called by `.`
- `this` keyword takes into account the property of the object
	- `this` means "Me". When an object says `this.color`, it means "_My_ specific color, not the general variable color."

## Constructors
**Definition:** A special method in a class used to initialize objects. It is called automatically when an instance of the class is created. It must have the same name as the class and no return type.
- same name as class
- no return type (just construct object)(not even `void)
- Called only once per object, at the moment of creation (`new`)
- constructor is automatically called when an object is created
- by default java creates a non-parameterized constructor 
```java
Class Strudent{
	String name;
	int age;
	
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student() {
		System.out.println("Constructor Called");
	}
}
```

### Non-Parameterized constructor 
- A constructor with no arguments.
```java
class Student {
    String name;
    // Non-parameterized
    Student() {
        System.out.println("Constructor Called");
    }
}
```
### Parameterized constructor
- A constructor that accepts arguments to initialize specific values.
```java
	Student(String name, int age){
	this.name = name;
	this.age = age;
	}
```
### Copy constructor
- Copies the values of one object into another object.
- **Note:** Java does not create a default copy constructor; you must define it yourself.
```java
// Defining a Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // Usage in main:
    // Student s1 = new Student("John", 20);
    // Student s2 = new Student(s1); // s2 copies s1's data
```
- used to copy properties of one object to another
- makes a copy of a object

## Destructors
*Definition:*
A mechanism to destroy objects that are no longer in use to free up memory.
- no destructors in java
- automatically deletes unused objects, variables, etc.
- no need to define destructors because java has a *garbage collector*

## Polymorphism
*Definition:*
The ability of a message or function to be displayed in more than one form. It allows a single interface to support entities of different types.
Compile time and Run time polymorphism (used in inheritance)
### Compile Time Polymorphism
- different functions but have same name
- ```java
class Helper {
    // Function 1: Takes string
    public static void info(String name) {
        System.out.println(name);
    }
    
    // Function 2: Takes integer
    public static void info(int n) {
        System.out.println(n);
    }
    
    // Function 3: Takes both
    public static void info(int n, String name) {
        System.out.println(name + " " + n);
    }
}

public class Main {
    public static void main(String[] args) {
        Helper.info("Dracula"); // Calls Function 1
        Helper.info(42);        // Calls Function 2
    }
}
  ```
  - this is an example for compile time polymorphism

## Inheritance
*Definition:*
A mechanism where a new class (Sub Class) acquires the properties and behaviors of an existing class (Base Class). It promotes code reusability.
- Triangle inherits shape
- color property is inherited
- `extends` keyword is used
```java
class Shape{
	String color;
}
class Triangle extends Shape{
	
}
public class OOPS{
	public static void main(String[] args){
		Triangle t1 = new Triangle();
		t1.color = "red"; //using the inherited color property
	}
}
```
- Base class/Parent class: Inherited from
- Sub Class/Child class:  Inherited by
- 4 types:
	- Single Inheritance: Class B inherits Class A
	- Multi-Level Inheritance: Class C inherits Class B, which inherits Class A
	- Hierarchical Inheritance: Class B and Class C both inherit Class A
	- **Hybrid:** Combination of the above
	_Note:_ Multiple Inheritance (Class C inherits A and B) is **not** supported in Java via classes (only via Interfaces).
```java
class Shape {
    public void display() {
        System.out.println("Displaying Shape");
    }
}

// Single Level
class Triangle extends Shape {
    public void area(int l, int h) {
        // Use 0.5 instead of 1/2 (because 1/2 is integer 0 in Java)
        System.out.println(0.5 * l * h); 
    }
}

// Multi-Level
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// Hierarchical (Circle also extends Shape, just like Triangle)
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}
```

### Access Modifiers
*Definition:*
Keywords that set the accessibility (visibility) of classes, methods, and other members.
4 types of access modifiers in JAVA:
- **public** : accessible in the class + accessible inside any package. If an object is created, it can be accessed. Accessible everywhere
- **private** : no access outside the class. Accessible **only** inside the class.
- **protected** : Accessible in same package + subclasses in other packages.
- **default** : default access modifier when not specified. Accessible only within the same package

#### How to access private then?
- Getter: give back the information of private
- Setter: set value for the private thing
- example:
```java
class User {
    private String name; // Private variable (hidden)

    // GETTER: Returns the private value
    public String getName() {
        return name;
    }

    // SETTER: Sets or updates the private value
    public void setName(String newName) {
        this.name = newName;
    }
}

// --- Usage ---
public class Main {
    public static void main(String[] args) {
        User obj = new User();

        // 1. Set the value using Setter
        obj.setName("Alex");

        // 2. Get the value using Getter
        System.out.println(obj.getName()); // Output: Alex
    }
}
```
**This is Encapsulation**

### Encapsulation
*Definition:* 
The process of wrapping code and data together into a single unit, often to protect the data from outside interference and misuse.
- The "Barrier": Data is not accessed directly. Instead, it is accessed only through functions inside that class.
#### Implementation:
- Keep attributes private.
- Use `public` methods (Getters and Setters) to access them
- Data Hiding: A feature that restricts direct access to object members to reduce errors and dependencies. Mark variables as `private`
- Uses access modifiers like private and protected to control visibility.

## Abstraction
*Definition:*
The property of hiding implementation details and showing only the essential features of the object to the user.

```java
abstract class Animal{ // abstract class
	abstract void walk(); // abstract method
}
class Horse extends Animal{
	public void walk(){
		System.out.println("4 Legs");
	}
}
class Chicken extends Animal{
	public void walk(){
		System.out.println("2 Legs");
	}
}
public class OOPS{
	public static void main(String[] args){
		Horse horse = new Horse();
		horse.walk(); // 4 legs
		
		// Animal animal = new Animal();
		// animal.walk()
		// **cannot instantiate object (runtime error)
		// because animal is an abstract concept
	}
}
```
- class Animal is just a concept. It has no property or method that we are using. So we use abstraction. 
Abstraction is achieved in 2 ways: 
- Abstract class
- Interfaces (Pure Abstraction)
### Abstract class
- An `abstract` class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated. Cannot do `new Animal()`
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.
- Can have both abstract methods (no body) and non-abstract methods (with body).
```java
abstract class Animal {
    abstract void walk(); // Abstract method (idea only)
    
    public void breathe() {
        System.out.println("Breathing"); // Non-abstract method
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
```

**When we call a object of derived class, first the base class constructor is called; then the constructor of derived class is called.
This is called constructor chaining.*** 

### Interfaces (Pure Abstraction)
- All the fields in interfaces are `public`, `static` and `final` by default.
- All methods are `public` & `abstract` by default.
- A class that implements an interface must implement all the methods declared in the interface.
- Interfaces support the functionality of multiple inheritance.
```java
interface Animal{
	int eyes = 2; // fixed for all animals
	// public value and static
	void walk(); // by default is public
	// Animal() -> Interfaces cannot have constructors
	// cannot have a non abstract method: definition or implementation
}
interface Herbivore{
	
}
class Horse implements Animal, Herbivore{
	public void walk(){
		System.out.println("4 legs");
	}
}

public class OOPS{
	public static void main(String[] args){
		Horse horse = new Horse();
		horse.walk();
	}
}	
```
**Multiple Inheritance (e.g. Horse inherited both Animal and Herbivore) is only possible through Interfaces and not through classes.

## Static Keyword
*Definition:*
The `static` keyword indicates that a member belongs to the **class definition** itself, rather than to any specific instance (object) of the class.
- Memory: Memory is allocated only once when the class is loaded (saves memory).
- Access: Can be accessed directly using the Class name (e.g., Student.school)
- Variable (also known as a class variable)
- Method (also known as a class method)
- Block
- Nested class
```java
class Student {
    String name;         // Unique for every student
    static String school; // COMMON for all students
}

public class OOP {
    public static void main(String[] args) {
        Student.school = "Harvard"; // Set once, applies to all
        
        Student s1 = new Student();
        s1.name = "Alice";
        
        Student s2 = new Student();
        s2.name = "Bob";
        
        System.out.println(s1.school); // Prints Harvard
        System.out.println(s2.school); // Prints Harvard
    }
}
```
- Memory to static keyword is given only once. 
- Static saves memory.
## Packages
*Definition:*
A mechanism to encapsulate a group of classes, sub-packages, and interfaces. It helps in organizing code and avoiding naming conflicts
- Package is a group of similar types of classes, interfaces and sub-packages.
- Packages can be built-in or user defined.
- Built-in packages - java, util, io etc.

```java
// File: Account.java
package bank; // Declaring the package

class Account {
    public String name;
}
```

```java
// File: Main.java
import bank.Account; // Importing the package

public class OOP {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "Customer 1";
    }
}
```