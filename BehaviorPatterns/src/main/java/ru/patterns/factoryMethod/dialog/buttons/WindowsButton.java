package ru.patterns.factoryMethod.dialog.buttons;

public class WindowsButton implements Button {

  public void render() {
    System.out.println("<button>Test WindowsButton</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! WindowsButton says - 'Hello World!'");
  }

}
