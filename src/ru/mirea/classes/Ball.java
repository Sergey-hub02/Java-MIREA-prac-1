package ru.mirea.classes;


public class Ball {
  private double radius;
  private String brand;
  private String sport;

  /**
   * Конструктор по умолчанию
   */
  public Ball() {
    this.radius = 0.0;
    this.brand = "None";
    this.sport = "None";
  }

  /**
   * Конструктор, создающий полноценный объект класса Ball
   * @param radius          радиус мяча
   * @param brand           фирма, производившая мяч
   * @param sport           вид спорта, для которого используется мяч
   */
  public Ball(double radius, String brand, String sport) {
    this.radius = radius;
    this.brand = brand;
    this.sport = sport;
  }

  /**
   * Геттер для поля radius
   * @return        радиус мяча
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Сеттер для поля radius
   * @param radius        новое значение радиуса мяча
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Геттер для поля brand
   * @return        фирма, производившая мяч
   */
  public String getBrand() {
    return brand;
  }

  /**
   * Сеттер для поля brand
   * @param brand         другая фирма, производившая мяч
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Геттер для поля sport
   * @return       вид спорта, для которого используется мяч
   */
  public String getSport() {
    return sport;
  }

  /**
   * Сеттер для поля sport
   * @param sport       другой вид спорта, для которого используется мяч
   */
  public void setSport(String sport) {
    this.sport = sport;
  }

  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return        строка с информацией об объекте
   */
  public String toString() {
    return "\tРадиус мяча: " + this.radius + "\n\tФирма: " + this.brand + "\n\tВид спорта: " + this.sport;
  }
}
