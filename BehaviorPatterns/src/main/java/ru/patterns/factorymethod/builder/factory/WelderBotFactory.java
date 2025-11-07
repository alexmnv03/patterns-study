package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;
import ru.patterns.factorymethod.builder.builders.WelderBot;

public class WelderBotFactory implements BuilderFactory {
  public BuilderRobot createBuilder() { return new WelderBot(); }
}

