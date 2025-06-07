package myLibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Publication> publications = new ArrayList<>();

    void displayAll() {
        for (Publication publication : publications) {
            System.out.println(publication.buildDisplayLine());
        }
    }

    void add(Publication publication) {
        publications.add(publication);
    }

    void find(String title) {
        Publication foundPublication = null;
        for (Publication publication : publications) {
            if (publication.getTitle().contains(title)) {
                foundPublication = publication;
                break;
            }
        }
        if (foundPublication != null) {
            System.out.println(foundPublication.buildDisplayLine());
        } else {
            try {
                throw new PublicationNotFoundException("『" + title + "』 could not be found.");
            } catch (PublicationNotFoundException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}

