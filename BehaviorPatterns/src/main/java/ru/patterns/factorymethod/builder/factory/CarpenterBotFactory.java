package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.builders.CarpenterBot;

class CarpenterBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new CarpenterBot(); }
}
