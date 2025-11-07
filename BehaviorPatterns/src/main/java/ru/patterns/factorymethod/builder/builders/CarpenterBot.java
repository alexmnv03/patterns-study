package ru.patterns.factorymethod.builder.builders;

import ru.patterns.factorymethod.builder.ConstructionSite;
import ru.patterns.factorymethod.builder.House;

/**
 * Плотник
 */
public class CarpenterBot implements BuilderRobot{
  private int basePower = 25;

  @Override
  public String getSpecialization() { return "Робот-Плотник"; }

  @Override
  public int getBasePower() { return basePower; }

  @Override
  public int workOn(House house, ConstructionSite site) {
    long helpers = site.countByType(HelperBot.class);
    long carpenters = site.countByType(CarpenterBot.class);
    // 1 плотнику нужен 1 подсобник
    double optimalHelpers = carpenters * 1.0;
    double efficiency = Math.min(1.0, helpers / optimalHelpers);
    int work = (int)(basePower * efficiency);
    house.addWork(work);
    System.out.println(getSpecialization() + " собирает опалубку (+ " + work + ")");
    return work;
  }
}
