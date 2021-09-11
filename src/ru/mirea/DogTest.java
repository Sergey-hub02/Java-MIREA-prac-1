package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.Dog;


public class DogTest {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите имя собаки: ");
    String dogName = IN.nextLine();

    System.out.print("Введите имя хозяина собаки: ");
    String dogOwner = IN.nextLine();

    System.out.print("Введите возраст собаки: ");
    int dogAge = IN.nextInt();

    Dog dog = new Dog(dogName, dogOwner, dogAge);

    System.out.println();
    System.out.println("Информация о собаке по имени " + dog.getName() + ": " + dog);
    System.out.println("Возраст " + dog.getName() + " по человеческим меркам: " + dog.toHumanAge());
  }
}
