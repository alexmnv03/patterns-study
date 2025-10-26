package ru.patterns.factoryMethod.dialog;

import java.util.ArrayList;
import java.util.List;
import ru.patterns.factoryMethod.dialog.factory.DialogAbstractFactory;
import ru.patterns.factoryMethod.dialog.factory.HtmlDialog;

public class DialogMain {

  static List<DialogAbstractFactory> dialogAbstractFactoryList = new ArrayList<>();
  static int numberOfDialogsToCreate = 5;

  public static void main(String[] args) {
    // 2. Наполняем список, используя нашу фабрику
    configure();

    // 3. Вызываем методы всех объектов в цикле
    System.out.println("\nВызываем методы для каждого объекта в цикле:");

    for (DialogAbstractFactory dialogAbstractFactory : dialogAbstractFactoryList) {
      dialogAbstractFactory.renderWindow(1); // Вызываем метод
      System.out.println("--------------------");
    }
  }

  private static void configure() {
    System.out.println("Создаем " + numberOfDialogsToCreate + " диалогов...");
    for (int i = 0; i < numberOfDialogsToCreate; i++) {
      // Мы просто просим фабрику дать нам диалог.
      // Нам не важно, какой именно (Windows или HTML).
      DialogAbstractFactory dialogAbstractFactory = new HtmlDialog();
      dialogAbstractFactoryList.add(dialogAbstractFactory);
    }
  }
}

