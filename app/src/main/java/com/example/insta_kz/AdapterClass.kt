package com.example.insta_kz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.graphics.drawable.Drawable
import java.io.InputStream

class AdapterClass(private val dataList: ArrayList<DataClass>) : RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.initImage.setImageResource(currentItem.dataImage)
        holder.initText.text = currentItem.dataTitle
    }

    override fun getItemCount(): Int = dataList.size

    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val initImage: ImageView = itemView.findViewById(R.id.post_image)
        val initText: TextView = itemView.findViewById(R.id.post_text)
    }
}