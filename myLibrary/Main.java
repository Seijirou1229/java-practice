package myLibrary;

import java.math.BigDecimal;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", BigDecimal.valueOf(330), 240, State.CHECKED_OUT);

        Library library = new Library();
        library.add(book);

        Magazine magazine = new Magazine("Software Design", "Panda Magazines", BigDecimal.valueOf(1562), 184, LocalDate.of(2024, 12, 18), 2025, 1, State.AVAILABLE);
        library.add(magazine);

        Book book1 = new Book("kokoro", "Soseki Natsume", BigDecimal.valueOf(770), 335, State.DEACCESSIONED);

        Book book2 = new Book("Harry Potter", "J.K.Rowling", BigDecimal.valueOf(2000), 512, State.DEACCESSIONED);

        Book book3 = new Book("Atomic Habits", "James Clear", BigDecimal.valueOf(407), 216, State.AVAILABLE);

        library.add(book1);
        library.add(book2);
        library.add(book3);


        book.checkIn();
        book2.checkIn();
        book1.checkOut();


        library.displayAll();
        library.find("Courage to be disliked");
    }
}
