package com.example.upes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.upes.R
import com.example.upes.model.ModuleDataClass

class ModuleRecyclerViewAdapter(
    val arraylist: ArrayList<ModuleDataClass>,
    val context: Context,
//    val listener: onHotelClicked
) : RecyclerView.Adapter<ModuleRecyclerViewAdapter.Viewholder>() {
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val level = itemView.findViewById<TextView>(R.id.level)
        val name = itemView.findViewById<TextView>(R.id.Module_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.module_layout_bg_item, parent, false)
        val viewHolder = Viewholder(view)
//        view.setOnClickListener {
//            listener.onitemClicked(viewHolder.adapterPosition)
//        }
        return viewHolder

    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.name.text = arraylist[position].firstModuleName
        holder.level.text = arraylist[position].level


    }

}

//    interface onHotelClicked{
//        fun onitemClicked(position:Int){
//
//        }
//    }
