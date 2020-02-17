package com.example.football.ui

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class MainUi : AnkoComponent<ViewGroup> {
    companion object {
        val name = 1
        val logo = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        verticalLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)
        }

        imageView {
            id = logo
            setImageResource(id)
            layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
        }

        textView{
            id = name
            layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
            textAlignment = View.TEXT_ALIGNMENT_CENTER
            textColor = Color.BLACK
            textSize = 18f
        }
    }
}