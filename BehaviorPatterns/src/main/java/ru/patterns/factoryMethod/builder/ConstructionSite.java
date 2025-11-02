package ru.patterns.factoryMethod.builder;

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
    return robots.stream().filter(r -> clazz.isInstance(r)).count();
  }
}
