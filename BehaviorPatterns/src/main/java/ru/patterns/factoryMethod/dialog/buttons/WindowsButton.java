package ru.patterns.factoryMethod.dialog.buttons;

public class WindowsButton extends AbstractButton implements Button {

  public void render() {
    System.out.println("<button>Test WindowsButton</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! WindowsButton says - 'Hello World!'");
  }

  @Override
  public void outSize() {
    System.out.println("Size WindowsButton = " + getSize());
  }

  public WindowsButton() {
  }

  public WindowsButton(int size) {
    setSize(size);
  }

}
