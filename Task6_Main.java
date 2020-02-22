import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6_Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        Task6_Books shelf1 = new Task6_Books(6);


        shelf1.addBook( new Task6_Book(1,1990, 234, 50,
                "book1", "me", "you") );
        shelf1.addBook(new Task6_Book(2,1980, 12, 9,
                "book2", "me", "mom")  );
        shelf1.addBook(new Task6_Book(3,2000, 190, 45,
                "book3", "dad", "you")   );
        shelf1.addBook(new Task6_Book(4,2010, 500, 200,
                "book4", "mom", "sis")   );
        shelf1.addBook(new Task6_Book(5,2020, 500, 197,
                "book4", "sis", "dad")   );
        shelf1.addBook(new Task6_Book(6,2010, 500, 2,
                "book4", "you", "peeta")   );
        shelf1.addBook(new Task6_Book(7,2002, 500, 197,
                "book4", "mom", "sis")   );

        System.out.println("Начальные книги");

        shelf1.showBooks();

        System.out.println();

        shelf1.sortByAuthor();
        System.out.println();

        shelf1.sortByEditor();
        System.out.println();

        shelf1.sortByPrice();
        System.out.println();

        shelf1.showBooks();
        System.out.print("Введите знак(+,-) и процент на сколько хотите изменить цену: ");
        float percent;
        try {
            percent = scaner.nextFloat();

        } catch (InputMismatchException e){
            System.out.println("Вы ввели не числовой символ. Цена не изменена");
            percent = 0;
        }
        shelf1.changePrice(percent);
        System.out.println();
        shelf1.showBooks();



        System.out.println();
        System.out.print("Введите имя автора, чтобы найти книги ");
        String author = scaner.next();
        shelf1.getBooksByAuthor(author).showBooks();


        System.out.println("Введите год после которого искать книги ");
        int year;
        try {
            year = scaner.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Вы ввели не числовой символ. Цена не изменена");
            year = 0;
        }

        shelf1.getBooksByYear(year).showBooks();
    }
}
