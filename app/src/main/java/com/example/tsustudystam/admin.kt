package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class admin : AppCompatActivity() {
    lateinit var aname : TextView
    lateinit var asurname :TextView
    lateinit var  aid : TextView
    lateinit var anationality :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val button1= findViewById<ImageView>(R.id.imageView11)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        aname = findViewById(R.id.textView14)
        asurname = findViewById(R.id.textView23)
        aid = findViewById(R.id.textView21)
        anationality =findViewById(R.id.textView22)
        val bundle = intent.extras
        if (bundle != null){
            aname.text = "name : ${bundle.getString("name")}"
            asurname.text = "surname : ${bundle.getString("surname")}"
            aid.text = "id : ${bundle.getString("id")}"
            aid.text = "nationality : ${bundle.getString("nationality")}"
        }




    }




}