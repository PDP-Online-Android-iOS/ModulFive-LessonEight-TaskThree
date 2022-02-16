package dev.ogabek.kotlin.adaptere

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Story

class StoryAdapter(var stories: List<Story>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_story, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story: Story = stories[position]
        if (holder is StoryViewHolder) {
            holder.fullName.text = story.fullName
            holder.storyProfile.setImageResource(story.profile)
        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }

    private class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var storyProfile: ShapeableImageView = view.findViewById(R.id.iv_story_profile)
        var fullName: TextView = view.findViewById(R.id.tv_story_full_name)

    }

}