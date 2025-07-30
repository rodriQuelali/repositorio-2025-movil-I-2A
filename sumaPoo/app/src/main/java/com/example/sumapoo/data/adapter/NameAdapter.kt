package com.example.sumapoo.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sumapoo.R


class NameAdapter(private val names: List<String>) :
    RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    class NameViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val itemText: TextView = itemView.findViewById(R.id.textViewName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)
        return  NameViewHolder(view)

    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
       val name = names[position]
        holder.itemText.text = name

    }

    override fun getItemCount(): Int = names.size


}