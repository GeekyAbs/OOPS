```Java
class Pen{
	String color;
	String type;
	
	public void write(){
		System.out.println("Write");
	}
	public void printColor(){
		System.out.println(this.color)
	}
}

public class OOPS{
	public static void main(String args[]){
		Pen pen1 = new Pen(); //object of class Pen
		pen1.color = "blue"; //properties
		pen1.type = "gel";
		
		pen1.write(); //will print pen1's color, 'this' keyword used
		
		Pen pen2 = new Pen(); //object of class Pen
		pen2.color = "red"; //properties
		pen2.type = "dot";
		
		pen2.write();
	}
}
```
- What is a function inside a class called?
	- Method
- Class defines the blueprint for an object
	- e.g. Pen defines the blueprint
- Variables inside the class
	- Properties, i.e. color, type
	- Properties, i.e. variable inside the parent class is defined by using '.'
	- Similarly, methods are also called by '.'
- 'this' keyword takes into account the property of the object

## Constructors
- same name as class
- no return type (just construct object)
- is only called when object is created
- constructor is automatically called when an object is created
- by default java creates a non-parameterized constructor when "Student()" is called
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

### Non-parameterized constructor 
- no argument
	```java
	Student() {
		System.out.println("Constructor Called");
	}
	```
### Parameterized constructor
```java
	Student(String name, int age){
	this.name = name;
	this.age = age;
	}
```
### Copy constructor
```java
Student s2 = new Student(s1);
s2.printInfo();
```
- used to copy properties of one object to another
- makes a copy of a object

## Destructors
- no destructors in java
- automatically deletes unused objects, variables, etc.
- no need to define destructors because java has a garbage collector

## Polymorphism
Compile time and Run time polymorphism (used in inheritance)
### Compile Time Polymorphism
- different functions but have same name
- ```java
  public static void info(String name){
	  
  }
  public static void info(int n){
  
  }
  public static void info(int n, String name){
  
  }
  public static void main(String[] args){
	  String name = "Dracula";
	  info(name);
  }
  ```
  - this is an example for compile time polymorphism

## Inheritance
- Triangle inherits shape
- color property is inherited
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
	- Single Inheritance 
	- Multiple Level Inheritance 
	- Hierarchal Inheritance
```java
class Shape{
	public static void main(String[] args){
		System.out.println("Displays area");
	}
}
// single level inheritance
class Triangle extends Shape{
	public void area(int l, int h){
		System.out.println(1/2 * l * h);
	}
}
// multi level inheritance
class EquilateralTro extends Triangle{
	public void area(int l, int h){
		System.out.println(1/2 * l * h);
	}
}
// hierarchal inheritance
class Circle extends Shape{
	public void area(int r){
		System.out.println(3.14*r*r);
	}
}
```

### Access Modifiers
4 types of access modifiers in JAVA:
- **public** : accessible in the class + accessible inside any package. If an object is created, it can be accessed.
- **private** : no access outside the class.
- **protected** : only sub classes in the different package can access. anyone in the current package.
- **default** : default access modifier when not specified.

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
- Core Definition: The process of wrapping data (attributes) and functions (methods) together into a single unit called a Class.
- The "Barrier": Data is not accessed directly. Instead, it is accessed only through functions inside that class.
#### Implementation:
- Keep attributes private.
- Provide public Getter and Setter methods to view or change the data.
- Data Hiding: A feature that restricts direct access to object members to reduce errors and dependencies.
- Uses access modifiers like private and protected to control visibility.

### Abstraction

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
#### Abstract class
- An abstract class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.

**When we call a object of derived class, first the base class constructor is called; then the constructor of derived class is called.
This is called constructor chaining.*** 

#### Interfaces (Pure Abstraction)
All the fields in interfaces are public, static and final by default.
All methods are public & abstract by default.
A class that implements an interface must implement all the methods declared in the interface.
Interfaces support the functionality of multiple inheritance.
```java
interface Animal{
	void walk();
	// Animal() -> Interfaces cannot have constructors
	// cannot have a non abstract method: definition or implementation
}

class Horse implements Animal{
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
## Packages
```java
package bank;

class Account{
	String name;
}

public class bank{

}
```

```java
import bank;
public class OOP{
	public static void main(String[] args){
		bank.Account account1 = new bank.Account();
		account1.name = "Customer 1";
	}
}
```