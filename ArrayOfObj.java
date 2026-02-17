import java.util.Scanner;

class Item {
  int code;
  double price;

  void accept(Scanner sc) {
    System.out.print("Enter Code: ");
    code = sc.nextInt();
    System.out.print("Enter Price: ");
    price = sc.nextDouble();
  }

  void display() {
    System.out.println(code + "\t" + price);
  }
}

class ArrayOfObj {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Item[] items = new Item[5];
    double total = 0;

    for (int i = 0; i < 5; i++) {
      items[i] = new Item();
      items[i].accept(sc);
      total += items[i].price;
    }

    System.out.println("Code\tPrice");
    for (Item item : items) {
      item.display();
    }

    System.out.println("Total Price: " + total);
  }
}
