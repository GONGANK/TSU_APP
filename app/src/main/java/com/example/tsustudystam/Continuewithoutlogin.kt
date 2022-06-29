package com.example.tsustudystam

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Continuewithoutlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continuewithoutlogin)

        val button1 = findViewById<ImageView>(R.id.imageView8)
        val button2 = findViewById<TextView>(R.id.textView12)
        val button3 = findViewById<TextView>(R.id.textView7)
        val button4 = findViewById<TextView>(R.id.textView13)
        val button5 = findViewById<ImageView>(R.id.imageView6)
        val button6 = findViewById<Button>(R.id.button4)
        val button7 = findViewById<Button>(R.id.button3)
        val button8 = findViewById<Button>(R.id.button2)

        val gmmIntentUri = Uri.parse("google.streetview:cbll=41.710232958255276,44.777817746583935")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")



        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, Contactus::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, Aboutus::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, Privace::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this, Faculties::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            startActivity(mapIntent)
        }

        button8.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://tsu.ge/"))
            startActivity(i)
        }

    }
}