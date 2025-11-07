package ru.patterns.factorymethod.builder.builders;

import ru.patterns.factorymethod.builder.ConstructionSite;
import ru.patterns.factorymethod.builder.House;

/**
 * Сварщик
 */
public class WelderBot implements BuilderRobot{
  private int basePower = 15;

  @Override
  public String getSpecialization() { return "Робот-Сварщик"; }

  @Override
  public int getBasePower() { return basePower; }

  @Override
  public int workOn(House house, ConstructionSite site) {
    // Эффективность не зависит от других
    house.addWork(basePower);
    System.out.println(getSpecialization() + " варит каркас (+ " + basePower + ")");
    return basePower;
  }
}
