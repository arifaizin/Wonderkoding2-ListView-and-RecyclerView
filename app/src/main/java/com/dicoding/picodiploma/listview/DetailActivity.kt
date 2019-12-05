package com.dicoding.picodiploma.listview

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
//        const val KEY_NAME = "key_name"
//        const val KEY_DESCRIPTION = "key_description"
//        const val KEY_PHOTO = "key_photo"
        const val KEY_HERO = "key_hero"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

//        val dataName = intent.getStringExtra(KEY_NAME)
//        val dataDescription = intent.getStringExtra(KEY_DESCRIPTION)
//        val dataPhoto = intent.getIntExtra(KEY_PHOTO, 0)

        val dataHero = intent.getParcelableExtra(KEY_HERO) as Hero
        supportActionBar?.title = dataHero.name
        tvDetailDescription.text = dataHero.description
        imgDetailPhoto.setImageResource(dataHero.photo)

    }
}
