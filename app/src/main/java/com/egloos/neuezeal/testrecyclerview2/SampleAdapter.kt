package com.egloos.neuezeal.testrecyclerview2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_box_1.view.*

class SampleAdapter(var list : List<SampleModel>, val layoutId: Int): RecyclerView.Adapter<SampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return SampleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.containerView.sampleImage.setImageResource(list[position].imageId)
        holder.containerView.descriptionText.text = list[position].description
    }
}