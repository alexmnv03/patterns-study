package ru.patterns.factorymethod.builder.builders;

import ru.patterns.factorymethod.builder.ConstructionSite;
import ru.patterns.factorymethod.builder.House;

/**
 * Штукатур
 */
public class PlastererBot implements BuilderRobot{
  private int basePower = 18;

  @Override
  public String getSpecialization() { return "Робот-Штукатур"; }

  @Override
  public int getBasePower() { return basePower; }

  @Override
  public int workOn(House house, ConstructionSite site) {
    long helpers = site.countByType(HelperBot.class);
    long plasterers = site.countByType(PlastererBot.class);
    // 1 штукатуру нужно 0.5 подсобника
    double optimalHelpers = plasterers * 0.5;
    double efficiency = Math.min(1.0, helpers / optimalHelpers);
    int work = (int)(basePower * efficiency);
    house.addWork(work);
    System.out.println(getSpecialization() + " штукатурит стены (+ " + work + ")");
    return work;
  }
}
