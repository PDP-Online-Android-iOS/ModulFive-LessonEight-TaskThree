package dev.ogabek.java.model;

public class Post {

    private final int post, profile;
    private final String fullName;

    public Post( int profile, String fullName, int post) {
        this.post = post;
        this.profile = profile;
        this.fullName = fullName;
    }

    public int getPost() {
        return post;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullName() {
        return fullName;
    }
}
