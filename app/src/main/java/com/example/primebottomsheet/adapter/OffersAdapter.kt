package com.example.primebottomsheet.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.primebottomsheet.R
import com.example.primebottomsheet.model.OfferModel

class OfferAdapter(private val items: ArrayList<OfferModel>): RecyclerView.Adapter<OfferViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val view = View.inflate(parent.context, R.layout.offer_item, null)
        return OfferViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val currentItem = items[position]
        holder.offerTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(currentItem.offerIcon, null, null, null)
        holder.offerTextView.text = currentItem.offerText
    }
}

class OfferViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val offerTextView: TextView = itemView.findViewById(R.id.offerTV)
}