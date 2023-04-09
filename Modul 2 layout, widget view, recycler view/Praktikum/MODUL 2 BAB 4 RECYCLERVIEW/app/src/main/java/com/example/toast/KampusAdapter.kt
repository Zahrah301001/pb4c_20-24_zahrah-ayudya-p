package com.example.toast

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class KampusAdapter( val namaKampus : Array<String>, val imgKampus : Array<Int>) : RecyclerView.Adapter<KampusAdapter.MyViewHolder>() {
    class MyViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        val tvKampus = view.findViewById<TextView>(R.id.txt_utm)
        val imgKampus = view.findViewById<ImageView>(R.id.img_utm)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_kampus, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvKampus.text = namaKampus[position]
        holder.imgKampus.setImageResource(imgKampus[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "${namaKampus[position]}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return namaKampus.size
    }


}