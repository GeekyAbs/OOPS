class Cons {
  int num;
  String name;

  Cons() {
    num = 0;
    name = "unknown";
  }

  Cons(int num, String name) {
    this.num = num;
    this.name = name;
  }

  void display() {
    System.out.println("Name: " + name + " Number: " + num);
  }
}

class constructor_overloading {
  public static void main(String[] args) {
    Cons obj1 = new Cons();
    Cons obj2 = new Cons(100, "Abesh");
    obj1.display();
    obj2.display();
  }
}
