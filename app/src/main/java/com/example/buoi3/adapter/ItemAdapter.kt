package com.example.buoi3.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.buoi3.R
import com.example.buoi3.Model.Affirmation
class ItemAdapter (
    private val context: Context,
    private val dataset: List<Affirmation>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
        class ItemViewHolder(private val view: View) :

        RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): ItemAdapter.ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemAdapter.ItemViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder,
                                  position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }
    override fun getItemCount() = dataset.size
}
