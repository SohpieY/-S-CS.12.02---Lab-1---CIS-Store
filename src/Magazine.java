public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;

    public Magazine(String coverStoryTitle, String printDate, int wordCount, String datePublished, String author, String name, String location, int price, String description){
        super(wordCount, datePublished, author, name, location, price, description);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public String getCoverStoryTitle(){
        return coverStoryTitle;
    }

    public String getPrintDate(){
        return printDate;
    }

    public void setCoverStoryTitle(String coverStoryTitle){
        this.coverStoryTitle = coverStoryTitle;
    }

    public void setPrintDate(String printDate){
        this.printDate = printDate;
    }
}
