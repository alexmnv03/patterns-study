package ru.patterns.factoryMethod.builder.factory;

import ru.patterns.factoryMethod.builder.builders.BuilderRobot;
import ru.patterns.factoryMethod.builder.builders.PlastererBot;

class PlastererBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new PlastererBot(); }
}