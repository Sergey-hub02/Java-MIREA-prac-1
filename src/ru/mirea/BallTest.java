package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.Ball;


public class BallTest {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите радиус мяча: " );
    double radius = IN.nextDouble();

    IN.nextLine();

    System.out.print("Введите фирму, которая произвела мяч: ");
    String brand = IN.nextLine();

    System.out.print("Введите спорт, в котором используется мяч: ");
    String sport = IN.next();

    Ball ball = new Ball(radius, brand, sport);

    System.out.println();
    System.out.println("Информация о мяче:");
    System.out.println(ball);
  }
}
