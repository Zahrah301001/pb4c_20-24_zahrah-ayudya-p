package com.example.praktikum

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdaptor( private val context: Context, private val superhero: List<Superhero>, val listener: (Superhero) -> Unit)
    : RecyclerView.Adapter<SuperheroAdaptor.SuperheroViewHolder>(){

    class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: Superhero, listener: (Superhero) -> Unit){
            imgSuperhero.setImageResource(superhero.imgsuperhero)
            nameSuperhero.text = superhero.namesuperhero
            descSuperhero.text = superhero.descSuperhero
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bindView(superhero[position], listener)
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Terimakasih telah memgunjungi ", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int = superhero.size
    }



