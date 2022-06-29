package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Faculties : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculties)

        val button2 = findViewById<ImageButton>(R.id.imageButton)

        button2.setOnClickListener {
            val intent = Intent(this, Continuewithoutlogin::class.java)
            startActivity(intent)
        }

    }


}

