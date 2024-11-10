public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;

    public ReadingItem(int wordCount, String datePublished, String author, String name, String location, int price, String description){
        super(name, location, price, description);
        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;
    }

    public int getWordCount(){
        return wordCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}
