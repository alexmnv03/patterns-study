package ru.patterns.factoryMethod.builder.builders;

import ru.patterns.factoryMethod.builder.ConstructionSite;
import ru.patterns.factoryMethod.builder.House;

/**
 * Крановщик
 */
public class CraneBot implements BuilderRobot{
  private int basePower = 50;

  @Override
  public String getSpecialization() { return "Робот-Крановщик"; }

  @Override
  public int getBasePower() { return basePower; }

  @Override
  public int workOn(House house, ConstructionSite site) {
    long welders = site.countByType(WelderBot.class);
    // Оптимально 1 сварщик на 1 крановщика
    double efficiency = Math.min(1.0, welders / 1.0);
    int work = (int)(basePower * efficiency);
    house.addWork(work);
    System.out.println(getSpecialization() + " подаёт материалы (+ " + work + ")");
    return work;
  }
}
