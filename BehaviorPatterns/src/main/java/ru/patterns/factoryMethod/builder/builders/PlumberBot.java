package ru.patterns.factoryMethod.builder.builders;

import ru.patterns.factoryMethod.builder.ConstructionSite;
import ru.patterns.factoryMethod.builder.House;

/**
 * Сантехник
 */
public class PlumberBot implements BuilderRobot{
  private int basePower = 22;

  @Override
  public String getSpecialization() { return "Робот-Сантехник"; }

  @Override
  public int getBasePower() { return basePower; }

  @Override
  public int workOn(House house, ConstructionSite site) {
    long helpers = site.countByType(HelperBot.class);
    // Эффективность зависит от 1 подсобника на сантехника
    double efficiency = Math.min(1.0, helpers / 1.0);
    int work = (int)(basePower * efficiency);
    house.addWork(work);
    System.out.println(getSpecialization() + " прокладывает трубы (+ " + work + ")");
    return work;
  }
}
