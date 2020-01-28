import java.util.Scanner;

public class Task6_Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        Task6_Books shelf1 = new Task6_Books(6);


        shelf1.addBook(1,1990, 234, 50,
                "book1", "me", "you");
        shelf1.addBook(2,1980, 12, 9,
                "book2", "me", "mom");
        shelf1.addBook(3,2000, 190, 45,
                "book3", "dad", "you");
        shelf1.addBook(4,2010, 500, 197,
                "book4", "mom", "sis");

        System.out.println("Начальные книги");

        shelf1.showBooks();

        System.out.println();
        System.out.print("Введите знак(+,-) и процент на сколько хотите изменить цену: ");
        int percent = scaner.nextInt();
        shelf1.changePrice(percent);



        System.out.println();
        shelf1.showBooks();



        System.out.println();
        System.out.print("Введите имя автора, чтобы найти книги ");
        String author = scaner.next();
        shelf1.getBooksByAuthor(author).showBooks();


        System.out.println("Введите год после которого искать книги ");
        int year = scaner.nextInt();
        shelf1.getBooksByYear(year).showBooks();
    }
}
