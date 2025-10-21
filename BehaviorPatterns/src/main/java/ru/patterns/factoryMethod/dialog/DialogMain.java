package ru.patterns.factoryMethod.dialog;

import java.util.ArrayList;
import java.util.List;
import ru.patterns.factoryMethod.dialog.buttons.Button;
import ru.patterns.factoryMethod.dialog.factory.Dialog;
import ru.patterns.factoryMethod.dialog.factory.HtmlDialog;

public class DialogMain {

  static List<Dialog> dialogList = new ArrayList<>();
  static int numberOfDialogsToCreate = 5;

  public static void main(String[] args) {
    // 2. Наполняем список, используя нашу фабрику
    configure();

    // 3. Вызываем методы всех объектов в цикле
    System.out.println("\nВызываем методы для каждого объекта в цикле:");

    for (Dialog dialog : dialogList) {
      dialog.renderWindow(); // Вызываем метод
      dialog.onClick();  // Вызываем другой метод
      System.out.println("--------------------");
    }
  }

  private static void configure() {
    System.out.println("Создаем " + numberOfDialogsToCreate + " диалогов...");
    for (int i = 0; i < numberOfDialogsToCreate; i++) {
      // Мы просто просим фабрику дать нам диалог.
      // Нам не важно, какой именно (Windows или HTML).
      Dialog dialog = new HtmlDialog();
      dialogList.add(dialog);
    }
  }
}

