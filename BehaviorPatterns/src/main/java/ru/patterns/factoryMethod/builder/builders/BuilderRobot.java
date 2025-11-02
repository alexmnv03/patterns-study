package ru.patterns.factoryMethod.builder.builders;

import ru.patterns.factoryMethod.builder.ConstructionSite;
import ru.patterns.factoryMethod.builder.House;

/**
 * Интерфейс робота-строителя
 */
public interface BuilderRobot {
  String getSpecialization();
  int getBasePower();
  int workOn(House house, ConstructionSite site);
}
