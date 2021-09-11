package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.Book;


public class BookTest {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Введите название книги: ");
    String title = IN.nextLine();

    System.out.print("Введите имя автора книги: ");
    String author = IN.nextLine();

    System.out.print("Введите количество страниц: ");
    int pages = IN.nextInt();

    Book book = new Book(title, author, pages);

    System.out.println();
    System.out.println("Информация о книге:");
    System.out.println(book);
  }
}
