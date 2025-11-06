package ru.patterns.factoryMethod.builder.factory;

import ru.patterns.factoryMethod.builder.builders.BuilderRobot;
import ru.patterns.factoryMethod.builder.builders.PlumberBot;

class PlumberBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new PlumberBot(); }
}