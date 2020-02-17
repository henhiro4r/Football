package com.example.football.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.football.model.League
import com.example.football.ui.MainUi
import com.squareup.picasso.Picasso
import org.jetbrains.anko.AnkoContext

class LeagueAdapter(private val items: List<League>) : RecyclerView.Adapter<LeagueAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(MainUi().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val l = items[position]
        holder.league_name.text = l.name
        l.image?.let { Picasso.get().load(it).into(holder.logo) }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var league_name : TextView = view.findViewById(MainUi.name)
        var logo : ImageView = view.findViewById(MainUi.logo)

    }
}