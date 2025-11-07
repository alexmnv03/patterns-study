package ru.patterns.factorymethod.dialog.factory;

import ru.patterns.factorymethod.dialog.buttons.Button;
import ru.patterns.factorymethod.dialog.buttons.WindowsButton;

public class WindowsDialog extends DialogAbstractFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
