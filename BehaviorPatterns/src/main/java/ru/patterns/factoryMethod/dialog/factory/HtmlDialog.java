package ru.patterns.factoryMethod.dialog.factory;

import ru.patterns.factoryMethod.dialog.buttons.Button;
import ru.patterns.factoryMethod.dialog.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
