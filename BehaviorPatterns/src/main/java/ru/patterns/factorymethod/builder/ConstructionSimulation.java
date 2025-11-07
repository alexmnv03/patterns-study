package ru.patterns.factorymethod.builder;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.factory.BuilderFactory;
import ru.patterns.factorymethod.builder.factory.CarpenterBotFactory;
import ru.patterns.factorymethod.builder.factory.CraneBotFactory;
import ru.patterns.factorymethod.builder.factory.HelperBotFactory;
import ru.patterns.factorymethod.builder.factory.MasonBotFactory;
import ru.patterns.factorymethod.builder.factory.PlastererBotFactory;
import ru.patterns.factorymethod.builder.factory.PlumberBotFactory;
import ru.patterns.factorymethod.builder.factory.WelderBotFactory;

/**
 *  Симуляция стройки
 */
public class ConstructionSimulation {

  public static void main(String[] args) {
    House house = new House(70_000);
    ConstructionSite site = new ConstructionSite();

    // создаём роботов
    BuilderFactory masonFactory = new MasonBotFactory();
    BuilderFactory helperFactory = new HelperBotFactory();
    BuilderFactory welderFactory = new WelderBotFactory();
    BuilderFactory craneFactory = new CraneBotFactory();
    BuilderFactory carpenterFactory = new CarpenterBotFactory();
    BuilderFactory plastererFactory = new PlastererBotFactory();
    BuilderFactory plumberFactory = new PlumberBotFactory();

    // пример набора
    site.addRobot(welderFactory.createBuilder());
    site.addRobot(craneFactory.createBuilder());
    site.addRobot(masonFactory.createBuilder());
    site.addRobot(masonFactory.createBuilder());
    site.addRobot(helperFactory.createBuilder());
    site.addRobot(helperFactory.createBuilder());
    site.addRobot(helperFactory.createBuilder());
    site.addRobot(carpenterFactory.createBuilder());
    site.addRobot(plastererFactory.createBuilder());
    site.addRobot(plumberFactory.createBuilder());

    int day = 0;
    while (!house.isBuilt()) {
      day++;
      System.out.println("\n=== День " + day + " ===");
      int workToday = 0;
      for (BuilderRobot r : site.getRobots()) {
        workToday += r.workOn(house, site);
      }
      System.out.println("Сделано за день: " + workToday + " единиц. Прогресс: " + house.getProgress() + "/" + house.getTotalWorkRequired());
    }

    System.out.println("\nДом построен за " + day + " дней!");
  }
}
