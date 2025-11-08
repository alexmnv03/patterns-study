package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.builders.CraneBot;

public class CraneBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new CraneBot(); }
}