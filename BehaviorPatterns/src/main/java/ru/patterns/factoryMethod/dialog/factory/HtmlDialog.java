package ru.patterns.factoryMethod.dialog.factory;

import ru.patterns.factoryMethod.dialog.buttons.Button;
import ru.patterns.factoryMethod.dialog.buttons.HtmlButton;

public class HtmlDialog extends DialogAbstractFactory {

  @Override
  public Button createButton(int size) {
    return new HtmlButton(size);
  }
}
