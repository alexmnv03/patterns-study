package ru.utils;

import java.util.Random;

public final class RandomNumberGenerator {

  public static int generateRandomNumber(int minValue, int maxValue) {
    /**
     * Генерирует случайное целое число в заданном диапазоне.
     *
     * @param minValue Минимальное значение диапазона (включительно).
     * @param maxValue Максимальное значение диапазона (включительно).
     * @return Случайное целое число в указанном диапазоне.
     */

    // Создаем объект класса Random
    Random rand = new Random();

    // Используем nextInt() для генерации числа в диапазоне
    return rand.nextInt((maxValue - minValue + 1)) + minValue;
  }

  public static int generateRandomNumber(int maxValue) {
    return generateRandomNumber(0, maxValue);
  }

  public static int generateRandomNumber() {
    return generateRandomNumber(0, 1000);
  }

}
