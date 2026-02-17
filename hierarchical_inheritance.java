class Shape {
  void display() {
    System.out.println("This is shape");
  }
}

class Circle extends Shape {
}

class Rectangle extends Shape {
}

class hierarchical_inheritance {
  public static void main(String[] args) {
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    c.display();
    r.display();
  }
}
