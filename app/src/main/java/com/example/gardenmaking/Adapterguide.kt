
package com.example.java

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gardenmaking.R
import com.example.gardenmaking.guide_data


class  Adapterguide(private val context: Context, private val list: List<guide_data>) :
    RecyclerView.Adapter<Adapterguide.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.guide_data, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name=itemView.findViewById<TextView>(R.id.title)
        var lastmessage=itemView.findViewById<TextView>(R.id.subtitle)
        var image=itemView.findViewById<ImageView>(R.id.imageview)

        fun bind(modelChat: guide_data) {

            name.text=modelChat.title
            lastmessage.text=modelChat.subtitle

            Glide.with(context)
                .load(modelChat.imageview)

                .placeholder(R.drawable.gad)
                .centerCrop()

                .into(image)

        }
    }
}