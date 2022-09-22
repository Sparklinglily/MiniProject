package com.example.miniproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //make reference to the button
        val to_submit = findViewById<Button>(R.id.to_submit)
        //set on click listener
        to_submit.setOnClickListener {
            //What should happen when the button is clicked
            profilePage()
        }
        //make reference to the 'forgot password'
        val forgot = findViewById<TextView>(R.id.forgot)
        //set an on click listener
        forgot.setOnClickListener {
            Resetter()
        }

        }
    private fun profilePage(){
        val i = Intent(this,ProfilePage::class.java)
        startActivity(i)
    }

    private fun Resetter(){
        val i = Intent(this, Reset::class.java)
        startActivity(i)
    }

    }




