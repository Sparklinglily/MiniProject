package com.example.miniproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Reset : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset)



        button= findViewById(R.id.submit)
        button.setOnClickListener {
            ProfilePager()
        }

    }

    private fun ProfilePager(){
        val i = Intent(this, ProfilePage::class.java)
        startActivity(i)
    }

}