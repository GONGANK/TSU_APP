package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<TextView>(R.id.Continue_without_login)
        val button2 = findViewById<TextView>(R.id.textView4)
        val button3 = findViewById<TextView>(R.id.textView3)

        button1.setOnClickListener {
            val intent = Intent(this, Continuewithoutlogin::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, Forgotpassword::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }



        }
    }