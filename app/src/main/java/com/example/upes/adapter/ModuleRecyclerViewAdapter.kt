package com.example.upes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.sharesphere.domain.repository.DataStoreRepositoryInterface
import com.example.upes.R
import com.example.upes.model.ModuleDataClass
import javax.inject.Inject

class ModuleRecyclerViewAdapter (
    val arraylist: ArrayList<ModuleDataClass>,
    val context: Context,
//    var level: Int,
//    var module: Int

//    val listener: onHotelClicked
) : RecyclerView.Adapter<ModuleRecyclerViewAdapter.Viewholder>() {
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val level = itemView.findViewById<TextView>(R.id.module)
        val name = itemView.findViewById<TextView>(R.id.level_name)

//        val level1 = itemView.findViewById<CardView>(R.id.level1)
//        val level2 = itemView.findViewById<CardView>(R.id.level2)
//        val level3 = itemView.findViewById<CardView>(R.id.level3)
//        val level4 = itemView.findViewById<CardView>(R.id.level4)
//        val level5 = itemView.findViewById<CardView>(R.id.level5)

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

//        holder.level1.setOnClickListener {
//            holder.level1.setCardBackgroundColor(context.resources.getColor(R.color.primary))
//            holder.level2.setCardBackgroundColor(context.resources.getColor(R.color.white))
//            holder.level3.setCardBackgroundColor(context.resources.getColor(R.color.white))
//            holder.level4.setCardBackgroundColor(context.resources.getColor(R.color.white))
//            holder.level5.setCardBackgroundColor(context.resources.getColor(R.color.white))
//        }

//        while (module > 0) {
//            when (level) {
//                5 -> {
//                    holder.level5.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.primary,
//                            context.theme
//                        )
//                    )
//                    holder.level4.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//                    holder.level3.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//                    holder.level2.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//                    holder.level1.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//                }
//
//                4 -> {
//                    holder.level4.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.primary,
//                            context.theme
//                        )
//                    )
//                    holder.level3.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//                    holder.level2.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//                    holder.level1.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//
//                }
//
//                3 -> {
//                    holder.level3.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.primary,
//                            context.theme
//                        )
//                    )
//                    holder.level2.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//                    holder.level1.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//
//                }
//
//                2 -> {
//                    holder.level2.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.primary,
//                            context.theme
//                        )
//                    )
//                    holder.level1.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.white,
//                            context.theme
//                        )
//                    )
//
//                }
//
//                1 -> {
//                    holder.level1.setCardBackgroundColor(
//                        context.resources.getColor(
//                            R.color.primary,
//                            context.theme
//                        )
//                    )
//
//                }
//            }
//        }
//
//
    }

}

//    interface onHotelClicked{
//        fun onitemClicked(position:Int){
//
//        }
//    }
