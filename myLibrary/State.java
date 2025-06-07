package myLibrary;

public enum State {
    AVAILABLE("Available"),
    CHECKED_OUT("Checked out"),
    DEACCESSIONED("deaccessioned");

    private String label;

    private State(String state) {
        this.label = state;
    }

    public String getLabel() {
        return label;
    }
}

