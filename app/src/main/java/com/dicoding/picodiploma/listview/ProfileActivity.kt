package com.dicoding.picodiploma.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.hide()

        Glide.with(this)
            .load("https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/small/avatar/dos:00a5bf2cb1620ee8d0472a7822b1c0cd20220401102521.png")
            .circleCrop()
            .into(imgProfile)
    }
}