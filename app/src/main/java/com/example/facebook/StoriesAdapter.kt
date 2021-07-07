package com.example.facebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoriesAdapter: RecyclerView.Adapter<StoriesAdapter.ListViewHolder>() {

    private val name =  arrayOf (
        "Bagus Genjing",
        "De Suas",
        "Made Guwung",
        "Tut Nyamprut"
    )

    private val profileImage = intArrayOf(
        R.drawable.artis1,
        R.drawable.artis2,
        R.drawable.artis3,
        R.drawable.artis4
    )

    private val postingan = intArrayOf(
        R.drawable.postingan1,
        R.drawable.postingan2,
        R.drawable.postingan3,
        R.drawable.postingan4
    )

    private val caption = arrayOf(
        "The results of my work, very good is not it?",
        "It's too pretty for me to look at",
        "It's so beautiful",
        "very pretty color isn't it?"
    )
    class ListViewHolder(storieItem: View): RecyclerView.ViewHolder(storieItem) {
        var name: TextView
        var profile: ImageView
        var caption: TextView
        var postingan: ImageView

        init {
            name = storieItem.findViewById(R.id.name)
            profile = storieItem.findViewById(R.id.profile_image)
            caption = storieItem.findViewById(R.id.caption)
            postingan = storieItem.findViewById(R.id.postingan)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.list_post, parent, false)
        return ListViewHolder(v)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.name.text = name[position]
        holder.profile.setImageResource(profileImage[position])
        holder.postingan.setImageResource(postingan[position])
        holder.caption.text = caption[position]
    }

    override fun getItemCount(): Int {
        return name.size
    }
}