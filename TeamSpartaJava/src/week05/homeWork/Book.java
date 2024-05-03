package week05.homeWork;

class Book {
    // 분류번호
    private Long id;
    // 책 이름
    private String bookName;
    // 작가 이름
    private String author;
    // 카테고리
    private String category;
    // 가격
    private double price;

    // constructer
    public Book(Long id, String bookName, String author, String category, double price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    // 책의 이름조회
    public String getBookName() {
        return bookName;
    }

    // 책의 카테고리조회
    public String getCategory() {
        return category;
    }
    // 책의 가격조회
    public double getPrice() {
        return price;
    }
    // 책의 가격책정
    public void setPrice(double price) {
        this.price = price;
    }
}