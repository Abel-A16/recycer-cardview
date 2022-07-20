package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var titles = arrayOf("chapter one", "chapter two", "chapter three", "chapter four", "chapter five", "chapter six", "chapter seven", "chapter eight")
    private var details = arrayOf("item one detail", "item one detail", "item one detail", "item one detail", "item one detail", "item one detail", "item one detail", "item one detail")
    private var images = intArrayOf(R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

        override fun getItemCount(): Int {
            return titles.size
        }
        override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position:Int){
            holder.itemTitle.text = titles[position]
            holder.itemDetail.text = details[position]
            holder.itemImage.setImageResource(images[position])
        }
        inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
            var itemImage: ImageView
            var itemTitle: TextView
            var itemDetail: TextView

            init {
                itemImage = itemView.findViewById(R.id.item_image)
                itemTitle = itemView.findViewById(R.id.item_title)
                itemDetail = itemView.findViewById(R.id.item_detail)
            }
        }
    }
