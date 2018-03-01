package com.example.gungde.intermediate12hours.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.example.gungde.intermediate12hours.R
import com.example.gungde.intermediate12hours.model.Social

/**
 * Created by gungdeaditya on 2/22/18.
 */

class ListAdapter(private val socials: List<Social>) : RecyclerView.Adapter<ListAdapter.ListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_row_list, parent, false)
        return ListHolder(view)
    }

    override fun onBindViewHolder(holder: ListAdapter.ListHolder, position: Int) {
        val social = socials[position]
        holder.imageView.setImageResource(social.image)
        holder.text.text = social.text
    }

    override fun getItemCount(): Int {
        return socials.size
    }

    inner class ListHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imageView: ImageView
        var text: TextView

        init {
            imageView = view.findViewById(R.id.gambar)
            text = view.findViewById(R.id.judul)
        }
    }
}
