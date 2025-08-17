package assignment1;

public class book {
	String title;
    String author;
    double price;

    public book(String Title, String Author, double Price) {
        title = Title;
        author = Author;
        price = Price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        book myBook1 = new book("Wings of Fire", "A.P.J. Abdul Kalam", 299.0);
        book myBook2 = new book("Harry Potter","J.K.Rowling",499.0);
        book myBook3 = new book("My Experiments with Truth","Mahatma Gandhi",300.0);
        myBook1.displayDetails();
        myBook2.displayDetails();
        myBook3.displayDetails();
    }

}

