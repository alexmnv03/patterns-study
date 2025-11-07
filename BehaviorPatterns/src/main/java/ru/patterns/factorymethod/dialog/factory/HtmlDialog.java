package ru.patterns.factorymethod.dialog.factory;

import ru.patterns.factorymethod.dialog.buttons.Button;
import ru.patterns.factorymethod.dialog.buttons.HtmlButton;

public class HtmlDialog extends DialogAbstractFactory {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
