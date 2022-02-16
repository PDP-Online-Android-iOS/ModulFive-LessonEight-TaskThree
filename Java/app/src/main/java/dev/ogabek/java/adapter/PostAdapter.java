package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.activity.MainActivity;
import dev.ogabek.java.model.Post;

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Post> posts;
    Context context;

    public PostAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Post post = posts.get(position);

        if (holder instanceof PostViewHolder) {
            VideoView video = ((PostViewHolder) holder).post;
            ((PostViewHolder) holder).profile.setImageResource(post.getProfile());
            video.setVideoPath("android.resource://dev.ogabek.java/" + post.getPost());
            ((PostViewHolder) holder).layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MediaController mediaController = new MediaController(context);
                    video.setMediaController(mediaController);
                    mediaController.setAnchorView(view);

                    if (video.isPlaying()) {
                        video.pause();
                    } else {
                        video.start();
                    }
                }
            });
            ((PostViewHolder) holder).fullName.setText(post.getFullName());
        }
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    private static class PostViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView profile;
        VideoView post;
        TextView fullName;
        LinearLayout layout;

        public PostViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_post_profile);
            post = view.findViewById(R.id.video);
            fullName = view.findViewById(R.id.tv_post_full_name);
            layout = view.findViewById(R.id.play);

        }
    }
}
