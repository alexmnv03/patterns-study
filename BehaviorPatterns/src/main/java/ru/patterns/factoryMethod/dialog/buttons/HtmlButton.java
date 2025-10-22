package ru.patterns.factoryMethod.dialog.buttons;

public class HtmlButton extends AbstractButton implements Button {

  public void render() {
    System.out.println("<button>Test HtmlButton</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! HtmlButton says - 'Hello World!'");
  }

  @Override
  public void outSize() {
    System.out.println("Size HtmlButton = " + getSize());
  }

  public HtmlButton() {
  }

  public HtmlButton(int size) {
    setSize(size);
  }

}
