import OOP.Keyboard;
import OOP.AdvanceKeyboard;

class Demo {
  public static void main(String[] args) {
    Keyboard k = new Keyboard();
    k.keys = 101;
    k.color = "black";
    System.out.println("Keys: " + k.keys);
    System.out.println("Color: " + k.color);
    k.pressed();
    k.throwIt();

    AdvanceKeyboard ak = new AdvanceKeyboard();
    ak.keys = 102;
    ak.color = "white";
    System.out.println("Keys: " + ak.keys);
    System.out.println("Color: " + ak.color);
  }

}
