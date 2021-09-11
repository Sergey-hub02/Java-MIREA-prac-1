package ru.mirea.classes;


public class Book {
  private String title;
  private String author;
  private int pages;

  /**
   * Конструктор по умолчанию
   */
  public Book() {
    this.title = "Unknown";
    this.author = "Anonymous";
    this.pages = 0;
  }

  /**
   * Конструктор, создающий книгу, имеющую только название
   * @param title       название книги
   */
  public Book(String title) {
    this.title = title;
    this.author = "Anonymous";
    this.pages = 0;
  }

  /**
   * Конструктор, создающий книгу, имеющую только название и имя автора
   * @param title         название книги
   * @param author        автор книги
   */
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  /**
   * Конструктор, создающий полноценный объект класса Book
   * @param title         название книги
   * @param author        автор книги
   * @param pages         количество страниц в книге
   */
  public Book(String title, String author, int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;
  }

  /**
   * Геттер для поля title
   * @return        название книги
   */
  public String getTitle() {
    return title;
  }

  /**
   * Сеттер для поля title
   * @param title       новое название книги
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Геттер для поля author
   * @return        имя автора книги
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Сеттер для поля author
   * @param author        новый автор книги
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   * Геттер для поля pages
   * @return        количество страниц в книге
   */
  public int getPages() {
    return pages;
  }

  /**
   * Сеттер для поля pages
   * @param pages       другое количество страниц в книге
   */
  public void setPages(int pages) {
    this.pages = pages;
  }

  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return        строка с информацией об объекте
   */
  public String toString() {
    return "\tНазвание книги: " + this.title
      + "\n\tАвтор книги: " + this.author
      + "\n\tКоличество страниц: " + this.pages;
  }
}
