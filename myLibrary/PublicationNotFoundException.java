package myLibrary;

public class PublicationNotFoundException extends Exception {
    PublicationNotFoundException(String message) {
        System.out.println(message);
    }
}
