package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageButton
import android.widget.TextView

class Aboutus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)

        val button1 = findViewById<ImageButton>(R.id.imageButton)


        button1.setOnClickListener {
            val intent = Intent(this, Continuewithoutlogin::class.java)
            startActivity(intent)
        }

    }
}