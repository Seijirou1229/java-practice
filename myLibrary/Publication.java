package myLibrary;

import java.math.BigDecimal;

abstract public class Publication {
    private String title;
    private BigDecimal price;
    private int page;
    private State state = State.AVAILABLE;


    public Publication(String title, BigDecimal price, int page, State state) {
        this.title = title;
        this.price = price;
        this.page = page;
        this.state = state;
    }

    public String getTitle() {
        if (this.title == null) {
            throw new IllegalArgumentException("It is unacceptable because the value is null.");
        }
        return title;
    }

    public BigDecimal getPrice() {
        if (this.price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("It is unacceptable because the value is negative.");
        }
        return price;
    }

    public int getPage() {
        if (this.page < 0) {
            throw new IllegalArgumentException("It is unacceptable because the value is negative.");
        }
        return page;
    }

    public State getState() {
        return state;
    }

    State checkOut() {
        state = State.CHECKED_OUT;
        return state;
    }

    State checkIn() {
        state = State.AVAILABLE;
        return state;
    }

    void deaccession() {
        if (this.state != State.AVAILABLE) {
            throw new IllegalStateException("It is unacceptable because the publication is" + this.state);
        }
        state = State.DEACCESSIONED;
    }

    void checkTitle() {
        try {
            this.getTitle();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    void checkPrice() {
        try {
            this.getPrice();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    void checkPage() {
        try {
            this.getPage();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    abstract String buildDisplayLine();
}
