package com.optiapp.foodlist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.optiapp.foodlist.R
import com.optiapp.foodlist.model.Declaration

class itemAdapter (private var context: Context, private var dataset:List<Declaration>): RecyclerView.Adapter<itemAdapter.itemViewHolder>() {
    class itemViewHolder(private var view: View): RecyclerView.ViewHolder(view){
        var image: ImageView =view.findViewById(R.id.foodImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        var adapterLayout=LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent,false)
        return itemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        var item=dataset[position]
//        holder.image.background=context.resources.getDrawable(item.stringResource)
        holder.image.setImageResource(item.stringResource)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}