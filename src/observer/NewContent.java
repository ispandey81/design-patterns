package observer;

// A class which holds the state which will be published by the publisher(Subject)
public class NewContent {

    private final String name;

    public NewContent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
