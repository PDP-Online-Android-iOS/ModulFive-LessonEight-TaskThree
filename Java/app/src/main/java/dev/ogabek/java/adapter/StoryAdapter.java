package dev.ogabek.java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Story;

public class StoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Story> stories;

    public StoryAdapter(List<Story> stories) {
        this.stories = stories;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed_story, parent, false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Story story = stories.get(position);

        if (holder instanceof StoryViewHolder) {
            ((StoryViewHolder) holder).fullName.setText(story.getFullName());
            ((StoryViewHolder) holder).storyProfile.setImageResource(story.getProfile());
        }
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    private static class StoryViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView storyProfile;
        TextView fullName;

        public StoryViewHolder(View view) {
            super(view);

            storyProfile = view.findViewById(R.id.iv_story_profile);
            fullName = view.findViewById(R.id.tv_story_full_name);

        }
    }
}
