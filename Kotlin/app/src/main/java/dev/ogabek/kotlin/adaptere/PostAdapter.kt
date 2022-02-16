package dev.ogabek.kotlin.adaptere

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Post

class PostAdapter(var context: Context, var posts: List<Post>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = posts[position]
        if (holder is PostViewHolder) {
            val video = holder.post
            holder.profile.setImageResource(post.profile)
            video.setVideoPath("android.resource://dev.ogabek.kotlin/" + post.post)
            holder.layout.setOnClickListener {
                if (video.isPlaying) {
                    video.pause()
                } else {
                    video.start()
                }
            }
            holder.fullName.text = post.fullName
        }
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    private class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var profile: ShapeableImageView
        var post: VideoView
        var fullName: TextView
        var layout: LinearLayout

        init {
            profile = view.findViewById(R.id.iv_post_profile)
            post = view.findViewById(R.id.video)
            fullName = view.findViewById(R.id.tv_post_full_name)
            layout = view.findViewById(R.id.play)
        }
    }
}