package com.dicoding.picodiploma.listview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_hero.view.*

class HeroAdapter internal constructor(private val context: Context) : RecyclerView.Adapter<HeroAdapter.ListViewHolder>() {
    internal var heroes = arrayListOf<Hero>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        //untuk menghubungkan dengan layout item
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_hero, parent, false)
        val viewHolder = ListViewHolder(itemView)
        return viewHolder
    }

    override fun getItemCount(): Int {
        //untuk jumlah item yang ditampilkan
        return heroes.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        //memberi data ke ViewHolder sesuai posisinya
        val hero = heroes[position]
        holder.bind(hero)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //mencocokkan data dengan komponen
        fun bind(hero: Hero) {
            with(itemView){
                txt_name.text = hero.name
                txt_description.text = hero.description
                img_photo.setImageResource(hero.photo)
                itemView.setOnClickListener {
                    val intentDetail = Intent(context, ConstraintDetailActivity::class.java)
                    val selectedHero = hero
                    intentDetail.putExtra(ConstraintDetailActivity.KEY_HERO, selectedHero)
                    context.startActivity(intentDetail)
                }
            }
        }
    }
}
