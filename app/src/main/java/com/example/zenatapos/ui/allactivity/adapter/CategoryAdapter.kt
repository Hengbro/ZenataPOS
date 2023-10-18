package com.example.zenatapos.ui.allactivity.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zenatapos.databinding.ItemCategoriesProductBinding
import com.example.zenatapos.model.Categories
@SuppressLint("NotifyDataSetChanged", "SetTextI18n")
class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.ViewHolder>(){

    private var data = ArrayList<Categories>()

    inner class ViewHolder(private val itemBinding: ItemCategoriesProductBinding): RecyclerView.ViewHolder(itemBinding.root){

        fun bind(item : Categories, position: Int){

            itemBinding.apply {

                tvName.text = item.name
                tvQty?.text = item.qty+"Product"

                /*layout.setOnClickListener{
                    onClick.invoke(item)
                }*/
            }
        }
    }

    fun removeAt(index: Int) {
        data.removeAt(index)
        notifyItemRemoved(index)
    }

    fun addItems(items : List<Categories>){
        //data.clear()
        data.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCategoriesProductBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position], position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

