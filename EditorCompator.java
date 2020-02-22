import java.util.Comparator;

public class EditorCompator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        String author1 = ((Task6_Book) obj1).getEditor();
        String author2 = ((Task6_Book) obj2).getEditor();
        return author1.compareTo(author2);
    }
}
