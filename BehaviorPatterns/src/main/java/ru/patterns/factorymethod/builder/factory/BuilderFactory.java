package ru.patterns.factorymethod.builder.factory;

import ru.patterns.factorymethod.builder.builders.BuilderRobot;

public interface BuilderFactory {
  BuilderRobot createBuilder();
}
