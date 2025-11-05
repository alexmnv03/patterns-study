package ru.patterns.factoryMethod.builder.factory;

import ru.patterns.factoryMethod.builder.builders.BuilderRobot;

interface BuilderFactory {
  BuilderRobot createBuilder();
}
