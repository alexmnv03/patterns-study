package ru.patterns.factoryMethod.builder.factory;

import ru.patterns.factoryMethod.builder.builders.BuilderRobot;
import ru.patterns.factoryMethod.builder.builders.CraneBot;

class CraneBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new CraneBot(); }
}