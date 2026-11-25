class Book{
    private String title;
    private String author;
    private int pageCount;
    public Book(String title,String author,int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
    public void displayBookDetails(){
        System.out.println("书名：" + title);
        System.out.println("作者：" + author);
        this.displayPageCount();
    }
    private void displayPageCount(){
        System.out.println("页数：" + pageCount);
    }
}
public class Example08 {
    public static void main(String[] args){
        Book book = new Book("Java基础入门","张三",400);
        book.displayBookDetails();
    }
}
