package ru.patterns.factorymethod.builder;

import java.util.ArrayList;
import java.util.List;
import ru.patterns.factorymethod.builder.builders.BuilderRobot;

/**
 * Класс "Стройплощадка"
 * Хранит всех роботов, нужен для оценки эффективности
 */
public class ConstructionSite {
  private List<BuilderRobot> robots = new ArrayList<>();

  public void addRobot(BuilderRobot robot) {
    robots.add(robot);
  }

  public List<BuilderRobot> getRobots() {
    return robots;
  }

  public long countByType(Class<?> clazz) {
    return robots.stream().filter(clazz::isInstance).count();
  }
}
