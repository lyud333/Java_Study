package array;

public class Book {
    private String bookName;
    private String auther;

    public Book(){}

    public Book(String bookName, String auther) {
        this.bookName=bookName;
        this.auther=auther;
    }

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuther(){
        return  auther;

    }
    public void setAuther(String auther){
        this.auther=auther;
    }
    public  void  showBookInfo(){
        System.out.println(bookName+", "+auther);
    }
}
