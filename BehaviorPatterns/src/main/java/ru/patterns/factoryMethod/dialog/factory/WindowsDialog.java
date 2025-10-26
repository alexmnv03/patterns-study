package ru.patterns.factoryMethod.dialog.factory;

import ru.patterns.factoryMethod.dialog.buttons.Button;
import ru.patterns.factoryMethod.dialog.buttons.WindowsButton;

public class WindowsDialog extends DialogAbstractFactory {

  @Override
  public Button createButton(int size) {
    return new WindowsButton(size);
  }
}
