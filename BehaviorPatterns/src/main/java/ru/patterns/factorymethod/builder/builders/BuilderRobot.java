package ru.patterns.factorymethod.builder.builders;

import ru.patterns.factorymethod.builder.ConstructionSite;
import ru.patterns.factorymethod.builder.House;

/**
 * Интерфейс робота-строителя
 */
public interface BuilderRobot {
  String getSpecialization();
  int getBasePower();
  int workOn(House house, ConstructionSite site);
}
