package com.dicoding.picodiploma.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_constraint_detail.*

class ConstraintDetailActivity : AppCompatActivity() {

    companion object{
        const val KEY_HERO = "key_hero"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_detail)

        supportActionBar?.hide()

        val dataHero = intent.getParcelableExtra(KEY_HERO) as Hero
        tvNameDetail.text = dataHero.name
        tvDescriptionDetail.text = dataHero.description
        imgPhotoDetail.setImageResource(dataHero.photo)
    }
}
