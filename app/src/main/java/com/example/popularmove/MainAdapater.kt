package com.example.popularmove

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainAdapater: RecyclerView.Adapter<MainAdapater.ViewHolder>() {
    private var list: List<String> = LinkedList()

    fun addItem(list: List<String>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapater.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MainAdapater.ViewHolder, position: Int) {
        holder.onBind(list[position])
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private var text:TextView = view.findViewById(R.id.item_tv)
        fun onBind(s: String) {
            text.setText(s)
        }


    }
}