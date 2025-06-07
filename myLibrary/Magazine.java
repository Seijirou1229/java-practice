package myLibrary;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class Magazine extends Publication {
    private String publisher;
    private LocalDate publicationDate;
    private int volume;
    private int number;

    public Magazine(String title, String publisher, BigDecimal price, int page, LocalDate publicationDate, int volume, int number, State state) {
        super(title, price, page, state);
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.volume = volume;
        if (this.volume == 0) {
            throw new IllegalArgumentException("It is unacceptable because the value is zero.");
        } else if (this.volume < 0) {
            throw new IllegalArgumentException("It is unacceptable because the value is negative.");
        }
        this.number = number;
    }


    public String getPublisher() {
        return publisher;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }


    public int getNumber() {
        if (this.number == 0) {
            throw new IllegalArgumentException("It is unacceptable because the value is zero.");
        } else if (this.number < 0) {
            throw new IllegalArgumentException("It is unacceptable because the value is negative.");
        }
        return number;
    }

    @Override
    String buildDisplayLine() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return ("Title『" + this.getTitle() + "』, Publisher：" + this.publisher + ", Price: $" + df.format(this.getPrice()) + ", Number of Pages: " + this.getPage() + "p" +
                ", Issue Date: " + this.publicationDate + ", Volume: " + this.volume + ", Number: " + this.getNumber() + ", Status: " + this.getState().getLabel());
    }


    void checkNumber() {
        try {
            this.getNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

