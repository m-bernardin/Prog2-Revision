public class Book {
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    private String title;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    private String author;
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    private int year;
    public Book(String title,String author,int year){
        this.author=author;
        this.title=title;
        this.year=year;
    }
    public boolean equals(Book book){
        if(book.toString().equals(this.toString()))return true;
        return false;
    }
    public String toString(){
        return title+" by "+author+" ("+year+")";
    }
}