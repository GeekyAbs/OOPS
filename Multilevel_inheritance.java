class Grandparent {
  void show1() {
    System.out.println("Grandparent");
  }
}

class Parent extends Grandparent {
  void show2() {
    System.out.println("Parent");
  }
}

class Child extends Parent {
  void show3() {
    System.out.println("Child");
  }
}

class Multilevel_inheritance {
  public static void main(String[] args) {
    Child c = new Child();
    c.show1();
    c.show2();
    c.show3();
  }
}
