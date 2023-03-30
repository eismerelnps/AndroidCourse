package com.elnps.android_course.recyclerView.adapter

import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.elnps.android_course.R
import com.elnps.android_course.recyclerView.SuperHero

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)

    fun render(superHeroModel: SuperHero){
        superHero.text = superHeroModel.SuperHero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher

    }
}