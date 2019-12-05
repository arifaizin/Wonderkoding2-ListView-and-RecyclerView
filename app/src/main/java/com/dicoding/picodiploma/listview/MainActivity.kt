package com.dicoding.picodiploma.listview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heroes = arrayListOf<Hero>()

        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)

        for (position in dataName.indices) {
            val hero = Hero(
                dataPhoto.getResourceId(position, -1),
                dataName[position],
                dataDescription[position]
            )
            heroes.add(hero)
        }

        val adapter = HeroAdapter(this)
        adapter.heroes = heroes

        lv_list.adapter = adapter

        lv_list.setOnItemClickListener { adapterView, view, position, l ->
            val intentDetail = Intent(this@MainActivity, DetailActivity::class.java)
//            intentDetail.putExtra(DetailActivity.KEY_NAME, heroes[position].name)
//            intentDetail.putExtra(DetailActivity.KEY_DESCRIPTION, heroes[position].description)
//            intentDetail.putExtra(DetailActivity.KEY_PHOTO, heroes[position].photo)
            val selectedHero = heroes[position]
            intentDetail.putExtra(DetailActivity.KEY_HERO, selectedHero)
            startActivity(intentDetail)
        }
    }
}
