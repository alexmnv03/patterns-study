package ru.patterns.factoryMethod.builder.factory;

import ru.patterns.factoryMethod.builder.builders.BuilderRobot;
import ru.patterns.factoryMethod.builder.builders.WelderBot;

class WelderBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new WelderBot(); }
}

