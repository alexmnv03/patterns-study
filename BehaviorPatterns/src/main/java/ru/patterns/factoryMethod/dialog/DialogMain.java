package ru.patterns.factoryMethod.dialog;

import static ru.utils.RandomNumberGenerator.generateRandomNumber;

import java.util.Random;
import ru.patterns.factoryMethod.dialog.factory.DialogAbstractFactory;
import ru.patterns.factoryMethod.dialog.factory.HtmlDialog;
import ru.patterns.factoryMethod.dialog.factory.WindowsDialog;

public class DialogMain {

//  static List<DialogAbstractFactory> dialogAbstractFactoryList = new ArrayList<>();
//  static int numberOfDialogsToCreate = 5;
  private static DialogAbstractFactory dialogAbstractFactory;

  public static void main(String[] args) {
    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации системы, окружения
     * или любых других настроек приложения
     * .
     */
    configure();
    // А вызываем мы независимо от созданного типа всегда один метод
    dialogAbstractFactory.renderWindow();



//    dialog = new HtmlDialog();


    // 2. Наполняем список, используя нашу фабрику
//    configure();

    // 3. Вызываем методы всех объектов в цикле
//    System.out.println("\nВызываем методы для каждого объекта в цикле:");

//    for (DialogAbstractFactory dialogAbstractFactory : dialogAbstractFactoryList) {
//      dialogAbstractFactory.renderWindow(generateRandomNumber()); // Вызываем метод
//      System.out.println("--------------------");
//    }
  }

//  private static void configure() {
//    System.out.println("Создаем " + numberOfDialogsToCreate + " диалогов...");
//    for (int i = 0; i < numberOfDialogsToCreate; i++) {
//      // Мы просто просим фабрику дать нам диалог.
//      // Нам не важно, какой именно (Windows или HTML).
//      DialogAbstractFactory dialogAbstractFactory = new HtmlDialog();
//      dialogAbstractFactoryList.add(dialogAbstractFactory);
//    }
//  }

  static void configure() {
    if (generateRandomNumber(1) == 1) {
      dialogAbstractFactory = new WindowsDialog();
    } else {
      dialogAbstractFactory = new HtmlDialog();
    }
  }
}

