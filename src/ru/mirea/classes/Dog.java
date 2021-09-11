package ru.mirea.classes;


public class Dog {
  private String name;
  private String owner;
  private int age;

  /**
   * Конструктор по умолчанию
   */
  public Dog() {
    this.name = "Unknown";
    this.owner = "Unknown";
    this.age = 0;
  }

  /**
   * Конструктор, создающий полноценный объект класса Dog
   * @param name            имя собаки
   * @param owner           имя хозяина собаки
   * @param age             возраст собаки
   */
  public Dog(String name, String owner, int age) {
    this.name = name;
    this.owner = owner;
    this.age = age;
  }

  /**
   * Геттер для поля name
   * @return        имя собаки
   */
  public String getName() {
    return this.name;
  }

  /**
   * Сеттер для поля name
   * @param newName         новое имя собаки
   */
  public void setName(String newName) {
    this.name = newName;
  }

  /**
   * Геттер для поля owner
   * @return          имя хозяина собаки
   */
  public String getOwner() {
    return this.owner;
  }

  /**
   * Сеттер для поля owner
   * @param newOwner      имя нового хозяина собаки
   */
  public void setOwner(String newOwner) {
    this.owner = newOwner;
  }

  /**
   * Геттер для поля age
   * @return          возраст собаки
   */
  public int getAge() {
    return this.age;
  }

  /**
   * Сеттер для поля age
   * @param newAge        новый возраст собаки
   */
  public void setAge(int newAge) {
    this.age = newAge;
  }

  /**
   * Конвертирует возраст собаки в человеческий возраст
   * @return          возраст собаки по человеческим меркам
   */
  public int toHumanAge() {
    return 7 * this.age;
  }

  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return        строка с информацией об объекте
   */
  public String toString() {
    return this.name + " : " + this.owner + " : " + this.age;
  }
}
