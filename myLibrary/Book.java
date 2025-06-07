package myLibrary;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Book extends Publication {
    private String author;

    public Book(String title, String author, BigDecimal price, int page, State state) {
        super(title, price, page, state);
        this.author = author;
    }

    @Override
    String buildDisplayLine() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return ("Title:『" + this.getTitle() + "』, Author: " + this.author + ", Price: $" + df.format(this.getPrice()) + ", Number of pages: " + this.getPage() + "p, Status: " + this.getState().getLabel());
    }


    public String getAuthor() {
        return this.author;
    }
}

