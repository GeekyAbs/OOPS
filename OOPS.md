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
## Packages
