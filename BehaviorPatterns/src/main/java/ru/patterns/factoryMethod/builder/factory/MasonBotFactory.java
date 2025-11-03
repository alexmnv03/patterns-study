package ru.patterns.factoryMethod.builder.factory;

import ru.patterns.factoryMethod.builder.builders.BuilderRobot;
import ru.patterns.factoryMethod.builder.builders.MasonBot;

class MasonBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new MasonBot(); }
}