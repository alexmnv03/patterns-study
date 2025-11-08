package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.builders.HelperBot;

public class HelperBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new HelperBot(); }
}
