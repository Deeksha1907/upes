package com.example.upes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.upes.R
import com.example.upes.model.BlogResModelItem

class CatagoryAdapter(
    val arraylist: ArrayList<BlogResModelItem>,
    val context: Context,
//
) : RecyclerView.Adapter<CatagoryAdapter.Viewholder>() {
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val author=itemView.findViewById<TextView>(R.id.author)
        val bio=itemView.findViewById<TextView>(R.id.bio)
        val content=itemView.findViewById<TextView>(androidx.appcompat.R.id.content)
        val title=itemView.findViewById<TextView>(R.id.title)
        val topic=itemView.findViewById<TextView>(R.id.topic)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.module_layout_bg_item, parent, false)
        val viewHolder = Viewholder(view)
        return viewHolder

    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.author.text= arraylist[position].author
        holder.bio.text= arraylist[position].bio
        holder.content.text= arraylist[position].content
        holder.title.text= arraylist[position].title
        holder.topic.text= arraylist[position].topic

    }
}