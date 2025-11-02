package ru.patterns.factoryMethod.builder.builders;

import ru.patterns.factoryMethod.builder.ConstructionSite;
import ru.patterns.factoryMethod.builder.House;

/**
 * Каменщик
 */
public class MasonBot implements BuilderRobot{
  private int basePower = 20;

  @Override
  public String getSpecialization() { return "Робот-Каменщик"; }

  @Override
  public int getBasePower() { return basePower; }

  @Override
  public int workOn(House house, ConstructionSite site) {
    long helpers = site.countByType(HelperBot.class);
    long masons = site.countByType(MasonBot.class);
    // На одного каменщика нужно 2 подсобника
    double optimalHelpers = masons * 2.0;
    double efficiency = Math.min(1.0, helpers / optimalHelpers);
    int work = (int)(basePower * efficiency);
    house.addWork(work);
    System.out.println(getSpecialization() + " кладёт кирпичи (+ " + work + ")");
    return work;
  }
}
