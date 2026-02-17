class Method {
  static void display() {
    System.out.println("Hello World");
  }
}

class static_method {
  static void display() {
    System.out.println("Static Method inside main class");
  }

  public static void main(String[] args) {
    display();
    Method.display(); // calling display without creating obj
  }
}
