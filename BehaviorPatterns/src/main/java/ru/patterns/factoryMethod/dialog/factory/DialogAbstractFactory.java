package ru.patterns.factoryMethod.dialog.factory;

import ru.patterns.factoryMethod.dialog.buttons.Button;

/**
 * Другой вариант это может быть оформлено как абстракный класс
 */
public abstract class DialogAbstractFactory {

  //Общий метод создания кнопки. обновления и вывода ее размер
  public void renderWindow(int size) {
    // ... остальной код диалога ...

    Button okButton = createButton(size);
    okButton.render();
    okButton.outSize();
  }

  /**
   * Подклассы будут переопределять этот метод, чтобы создавать конкретные
   * объекты продуктов, разные для каждой фабрики.
   */
  public abstract Button createButton(int size);
}
