package com.example.football

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.football.adapter.LeagueAdapter
import com.example.football.model.League
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {
    private var items: MutableList<League> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<RecyclerView>(R.id.league)
        initData()
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = LeagueAdapter(items)
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.league_name)
        val image = resources.obtainTypedArray(R.array.league_logo)
        val description = resources.getStringArray(R.array.league_description)
        items.clear()
        for (i in name.indices){
            items.add(League(name[i], description[i], image.getResourceId(i, 0)))
        }
        image.recycle()
    }
}
