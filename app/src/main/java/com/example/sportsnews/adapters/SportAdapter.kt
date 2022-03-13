package com.example.sportsnews.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sportsnews.R
import com.example.sportsnews.models.Sport

class SportAdapter(
    private val context: Context,
    private val layout: Int,
    private val sportList: List<Sport>
) :
    RecyclerView.Adapter<SportAdapter.SportHolder>() {

    class SportHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.img)
        val textName: TextView = view.findViewById(R.id.textName)
        val textCategory: TextView = view.findViewById(R.id.textCat)
        val textSummary: TextView = view.findViewById(R.id.textSmry)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportHolder {
        val view = LayoutInflater.from(context).inflate(layout, parent, false)
        return SportHolder(view)
    }

    override fun onBindViewHolder(holder: SportHolder, position: Int) {
        val sport = sportList[position]
        holder.textName.text = sport.name
        holder.textCategory.text = sport.category
        holder.textSummary.text = sport.summary
        Glide.with(context).load(sport.image).into(holder.img)
    }

    override fun getItemCount() = sportList.size

}