package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.builders.PlumberBot;

public class PlumberBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new PlumberBot(); }
}