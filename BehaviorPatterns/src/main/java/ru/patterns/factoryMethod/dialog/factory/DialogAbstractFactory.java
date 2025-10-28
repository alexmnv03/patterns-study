package ru.patterns.factoryMethod.dialog.factory;

import ru.patterns.factoryMethod.dialog.buttons.Button;

/**
 * Другой вариант это может быть оформлено как абстракный класс
 * Но этот класс не обязателенЮ только для удобсвта
 */
public abstract class DialogAbstractFactory {

  //Общий метод создания кнопки. обновления и вывода ее размер
  public void renderWindow() {
    // ... остальной код диалога ...

    Button okButton = createButton();
    okButton.render();
  }

  /**
   * Подклассы будут переопределять этот метод, чтобы создавать конкретные
   * объекты продуктов, разные для каждой фабрики.
   */
  public abstract Button createButton();
}
