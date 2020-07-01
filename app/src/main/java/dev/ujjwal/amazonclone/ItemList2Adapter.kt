package dev.ujjwal.amazonclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemList2Adapter : RecyclerView.Adapter<ItemList2Adapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_layout_2, parent, false)
    )

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    }

    override fun getItemCount() = 10

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
