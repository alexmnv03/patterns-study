package ru.patterns.factoryMethod.builder;

public class House {
  private int totalWorkRequired;
  private int currentProgress = 0;

  public House(int totalWorkRequired) {
    this.totalWorkRequired = totalWorkRequired;
  }

  public void addWork(int work) {
    currentProgress += work;
  }

  public boolean isBuilt() {
    return currentProgress >= totalWorkRequired;
  }

  public int getProgress() {
    return currentProgress;
  }

  public int getTotalWorkRequired() {
    return totalWorkRequired;
  }
}
