public class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }
    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
    Book(String isbn){
        this(isbn, "Unknow,","Unknown");
    }
    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book: "+ this.title);
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        }
        else{
            System.out.println("This books is already in library");
        }
    }

    public static void main(String[] args){
        Book designOfThings = new Book("1","Design","Author");
        Book myBook = new Book("2");

        System.out.println(Book.getTotalNoOfBooks());

        designOfThings.borrowBook();
        designOfThings.borrowBook();

        designOfThings.returnBook();
        designOfThings.returnBook();

        myBook.borrowBook();
        myBook.returnBook();
    }
}
