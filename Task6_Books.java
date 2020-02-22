import java.awt.print.Book;
import java.util.Arrays;

public class Task6_Books {
    private Task6_Book[] books;
    private int books_amount;




    public Task6_Books(int books_amount) {
        books = new Task6_Book[books_amount];
    }

    public Task6_Book[] getBooks() {
        return books;
    }

    public void addBook(Task6_Book book) {

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
                System.out.println(elem.toString());
            } else {
                break;
            }
        }
    }

    public void changePrice(float percent){
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
                if(cur_author.equals(author)){
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
            }
        }
        if (year_books.books[0] == null){
            System.out.println("Книги не найдены");
        }
        return year_books;
    }

    public void sortByAuthor(){
        Task6_Book [] copyArr =  Arrays.copyOf(this.getBooks(), this.getBooks().length);
        Arrays.sort( copyArr , new AuthorComparator());
        for (Task6_Book elem : copyArr){
            System.out.println(elem);
        }
    }

    public void sortByEditor(){
        Task6_Book [] copyArr =  Arrays.copyOf(this.getBooks(), this.getBooks().length);
        Arrays.sort( copyArr , new EditorCompator());
        for (Task6_Book elem : copyArr){
            System.out.println(elem);
        }
    }

    public void sortByPrice(){
        Task6_Book [] copyArr =  Arrays.copyOf(this.getBooks(), this.getBooks().length);
        Arrays.sort( copyArr , new PriceComparator());
        for (Task6_Book elem : copyArr){
            System.out.println(elem);
        }
    }


}
