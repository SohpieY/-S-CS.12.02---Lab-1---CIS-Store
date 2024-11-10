public class Book extends ReadingItem {
    private String title;
    private String edition;
    private String isbn;

    public Book(String title, String edition, String isbn,int wordCount, String datePublished, String author, String name, String location, int price, String description){
        super(wordCount, datePublished, author, name, location, price, description);
        this.title = title;
        this.edition = edition;
        this.isbn = isbn;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                ", isbn='" + isbn + '\'' +
                ", wordCount=" + getWordCount() +
                ", datePublished='" + getDatePublished() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}';
    }



    public String getTitle(){
        return title;
    }

    public String getEdition(){
        return edition;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setEdition(String edition){
        this.edition = edition;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
}
