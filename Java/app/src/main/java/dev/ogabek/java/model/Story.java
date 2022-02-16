package dev.ogabek.java.model;

public class Story {

    private final int profile;
    private final String fullName;

    public Story(int profile, String fullName) {
        this.profile = profile;
        this.fullName = fullName;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullName() {
        return fullName;
    }

}
