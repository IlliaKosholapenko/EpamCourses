import java.util.Comparator;

class AuthorComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        String author1 = ((Task6_Book) obj1).getAuthor();
        String author2 = ((Task6_Book) obj2).getAuthor();
        return author1.compareTo(author2);
    }



}
