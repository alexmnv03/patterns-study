package ru.patterns.factorymethod.builder.builders;

import ru.patterns.factorymethod.builder.ConstructionSite;
import ru.patterns.factorymethod.builder.House;

/**
 * Подсобник
 */
public class HelperBot implements BuilderRobot{
  private int basePower = 5;

  @Override
  public String getSpecialization() { return "Робот-Подсобник"; }

  @Override
  public int getBasePower() { return basePower; }

  @Override
  public int workOn(House house, ConstructionSite site) {
    // Подсобник сам по себе немного помогает
    house.addWork(basePower);
    System.out.println(getSpecialization() + " таскает материалы (+ " + basePower + ")");
    return basePower;
  }
}
