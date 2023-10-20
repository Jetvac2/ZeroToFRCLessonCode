public class Book {
  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    System.out.println(this.title);
    System.out.println(this.author);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
