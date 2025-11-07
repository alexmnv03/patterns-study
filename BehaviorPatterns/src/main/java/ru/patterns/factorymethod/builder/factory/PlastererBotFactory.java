package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.builders.PlastererBot;

public class PlastererBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new PlastererBot(); }
}