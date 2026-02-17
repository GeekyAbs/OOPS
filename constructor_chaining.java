class Cons {
  Cons() {
    System.out.println("Non Parameterized Constructor");
  }

  Cons(int x) {
    this();
    System.out.println("Parameterized " + "Number: " + x);
  }

  Cons(double x) {
    this(5);
    System.out.println("Parameterized " + "Number: " + x);
  }
}

class constructor_chaining {
  public static void main(String[] args) {
    Cons obj = new Cons(5.75);
  }
}
