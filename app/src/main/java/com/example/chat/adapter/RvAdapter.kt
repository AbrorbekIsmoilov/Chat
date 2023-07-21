package com.example.chat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chat.databinding.ItemRvBinding
import com.example.ecoavalon.models.MyMessage

class RvAdapter(val list: ArrayList<MyMessage> = ArrayList()):RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(val itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(myMessage: MyMessage){
            itemRvBinding.text.text = myMessage.text
            itemRvBinding.date.text = myMessage.date
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvAdapter.Vh {
    return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RvAdapter.Vh, position: Int) {
holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}