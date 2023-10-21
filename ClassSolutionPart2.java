class Main {

  public static void main(String[] args) {
    Book myBook = new Book("Booky", "Me");
    System.out.println(myBook.getAuthor());
    System.out.println(myBook.getTitle());

    myBook.setTitle("Booky Volume 2");
    System.out.println(myBook.getTitle());
  }
}
