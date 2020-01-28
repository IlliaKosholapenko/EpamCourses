import java.awt.print.Book;
import java.util.Arrays;

public class Task6_Books {
    private Task6_Book[] books;
    private int books_amount;




    public Task6_Books(int books_amount) {
        books = new Task6_Book[books_amount];
    }

    public void addBook(int id, int year, int pages_amount, int price, String name, String editor, String author) {
        Task6_Book book = new Task6_Book(id, year, pages_amount, price, name, editor, author);
        for(int i = 0; i < books.length ; i++) {
            if(books[i] == null){
                books[i] = book;
                books_amount = i;
                break;
            }
        }

    }



        public void showBooks(){
        for (Task6_Book elem: books) {
            if (elem != null) {
                elem.view();
            } else {
                break;
            }
        }
    }

    public void changePrice(int percent){
        float fractional_percent = percent * 0.01f;

        for (Task6_Book elem : books){
            if (elem != null) {
                float old_price = elem.getPrice();
                float price = old_price + (old_price * fractional_percent);
                elem.setPrice(price);
            } else {
                break;
            }
        }
    }

    public Task6_Books getBooksByAuthor(String author) {
        Task6_Books author_books = new Task6_Books(books_amount);
        int i = 0;
        for (Task6_Book elem: books){
            if (elem != null){
                String cur_author = elem.getAuthor();
                if(cur_author == author){
                    author_books.books[i] = elem;
                    i++;
                }
            } else {
                break;
            }
        }
        if (author_books.books[0] == null){
            System.out.println("Книги не найдены");
        }
        return author_books;
    }

    public Task6_Books getBooksByYear(int year){
        Task6_Books year_books = new Task6_Books(this.books.length);
        int i = 0;
        for (Task6_Book elem: books){
            if(elem != null) {
                int cur_year = elem.getYear();
                if (cur_year > year) {
                    year_books.books[i] = elem;
                    i++;
                }
            } else {
                continue;
            }
        }
        if (year_books.books[0] == null){
            System.out.println("Книги не найдены");
        }
        return year_books;
    }

}
