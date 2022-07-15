package com.peelu.merishayari.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peelu.merishayari.AllShayariActivity
import com.peelu.merishayari.R
import com.peelu.merishayari.databinding.ItemShayariBinding
import com.peelu.merishayari.model.ShayariModel

// making adapter to render all shayari from firebase

class AllShayariAdapter(
    val allShayariActivity: AllShayariActivity,
    private val shayariList: ArrayList<ShayariModel>
) :RecyclerView.Adapter<AllShayariAdapter.ShayariViewHolder>(){
    // implementing all members
    // added shayariViewHolder class
    class ShayariViewHolder(val binding: ItemShayariBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShayariViewHolder {
        // binding ShayariViewHolder with ItemShayariBinding
        return  ShayariViewHolder(ItemShayariBinding.inflate(LayoutInflater.from(parent.context),parent,false))


    }

    override fun onBindViewHolder(holder: ShayariViewHolder, position: Int) {


        if(position%8==0){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_1)
        }else if(position%8==1){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_2)
        }else if(position%8==2){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_3)
        }else if(position%8==3){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_4)
        }else if(position%8==4){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_5)
        }else if(position%8==5){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_6)
        }else if(position%8==6){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_7)
        }else if(position%8==7){
            holder.binding.mainBackGRound.setBackgroundResource(R.drawable.gradient_8)
        }

        holder.binding.itemShayari.text = shayariList[position].data.toString()
    }

    override fun getItemCount() = shayariList.size
}