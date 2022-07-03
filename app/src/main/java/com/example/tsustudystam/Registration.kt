package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val button1 = findViewById<ImageButton>(R.id.imageButton)
        val inputmail1 = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val inputpass1 = findViewById<EditText>(R.id.editTextTextPassword2)
        val inputpass2 = findViewById<EditText>(R.id.editTextTextPassword3)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        when {
        }



    }




}