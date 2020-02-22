public class Task6_Book {
    private int id,
                year,
                pages_amount;
    private String name,
                   editor,
                   author;
    float price;

    public Task6_Book(int id, int year, int pages_amount, float price, String name, String editor, String author) {
        this.id = id;
        this.year = year;
        this.pages_amount = pages_amount;
        this.price = price;
        this.name = name;
        this.editor = editor;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book : " +
                "id = " + id +
                ", year = " + year +
                ", pages_amount = " + pages_amount +
                ", name = " + name +
                ", editor = " + editor +
                ", author = " + author +
                ", price = " + price;
    }





    public int getYear() {
        return year;
    }



    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }
}
