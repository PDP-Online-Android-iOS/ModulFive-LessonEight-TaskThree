package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.PostAdapter;
import dev.ogabek.java.adapter.StoryAdapter;
import dev.ogabek.java.model.Post;
import dev.ogabek.java.model.Story;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerFeed, recyclerStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerFeed = findViewById(R.id.recyclerFeed);
        recyclerStory = findViewById(R.id.recyclerStory);

        recyclerFeed.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerStory.setLayoutManager(new GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false));

        refreshFeedAdapter(getAllPosts());
        refreshStoryAdapter(getAllStories());
    }

    private void refreshFeedAdapter(ArrayList<Post> posts) {
        recyclerFeed.setAdapter(new PostAdapter(this, posts));
    }

    private void refreshStoryAdapter(ArrayList<Story> stories) {
        recyclerStory.setAdapter(new StoryAdapter(stories));
    }

    private ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_kamron, "Kamron", R.raw.video_1));
        posts.add(new Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_kamron, "Kamron", R.raw.video_1));
        posts.add(new Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_kamron, "Kamron", R.raw.video_1));
        posts.add(new Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_kamron, "Kamron", R.raw.video_1));
        posts.add(new Post(R.drawable.user_ogabekdev, "Ogabek Matyakubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_bogibek, "Bogibek Matyaqubov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_elmurod, "Elmurod Nazirov", R.raw.video_1));
        posts.add(new Post(R.drawable.user_kamron, "Kamron", R.raw.video_1));

        return posts;

    }

    private ArrayList<Story> getAllStories() {
        ArrayList<Story> stories = new ArrayList<>();

        stories.add(new Story(R.drawable.user_ogabekdev, "Ogabek"));
        stories.add(new Story(R.drawable.user_bogibek, "Bogibek"));
        stories.add(new Story(R.drawable.user_elmurod, "Elmurod"));
        stories.add(new Story(R.drawable.user_kamron, "Kamron"));
        stories.add(new Story(R.drawable.user_ogabekdev, "Ogabek"));
        stories.add(new Story(R.drawable.user_bogibek, "Bogibek"));
        stories.add(new Story(R.drawable.user_elmurod, "Elmurod"));
        stories.add(new Story(R.drawable.user_kamron, "Kamron"));
        stories.add(new Story(R.drawable.user_ogabekdev, "Ogabek"));
        stories.add(new Story(R.drawable.user_bogibek, "Bogibek"));
        stories.add(new Story(R.drawable.user_elmurod, "Elmurod"));
        stories.add(new Story(R.drawable.user_kamron, "Kamron"));
        stories.add(new Story(R.drawable.user_ogabekdev, "Ogabek"));
        stories.add(new Story(R.drawable.user_bogibek, "Bogibek"));
        stories.add(new Story(R.drawable.user_elmurod, "Elmurod"));
        stories.add(new Story(R.drawable.user_kamron, "Kamron"));

        return stories;

    }

}