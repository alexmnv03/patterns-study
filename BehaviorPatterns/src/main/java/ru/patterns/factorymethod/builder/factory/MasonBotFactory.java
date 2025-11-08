package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.builders.MasonBot;

public class MasonBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new MasonBot(); }
}