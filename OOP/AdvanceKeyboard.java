package OOP;

public class AdvanceKeyboard extends Keyboard {
  private String lightColor;
  private int lightIntensity;

  int getLightIntensity() {
    return lightIntensity;
  }

  void setLightIntensity(int lightIntensity) {
    this.lightIntensity = lightIntensity;
  }

  String getLightColor() {
    return lightColor;
  }

  void setLightColor(String lightColor) {
    this.lightColor = lightColor;
  }

  public void type() {
    System.out.println("Typing...");
  }

  public void changeColor() {
    System.out.println("Color changed");
  }
}
