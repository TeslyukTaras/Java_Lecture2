package model.component;

public enum Topic {
    PROGRAMMING_LANGUAGE("programming languages"),
    NETWORKING_LIBRARY("networking"),
    DATABASE_LIBRARY("databases"),
    IMAGE_LOADING_LIBRARY("image loading");

    private final String name;

    private Topic(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
