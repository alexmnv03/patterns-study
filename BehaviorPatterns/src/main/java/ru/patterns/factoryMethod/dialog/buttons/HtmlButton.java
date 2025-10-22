package ru.patterns.factoryMethod.dialog.buttons;

public class HtmlButton implements Button {

  public void render() {
    System.out.println("<button>Test HtmlButton</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! HtmlButton says - 'Hello World!'");
  }

  @Override
  public int outSize() {
    return 0;
  }
}
