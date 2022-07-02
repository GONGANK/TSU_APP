package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView

class Faculties : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculties)

        val button2 = findViewById<ImageButton>(R.id.imageButton)
        val button3 = findViewById<TextView>(R.id.textView6)
        val button4 = findViewById<TextView>(R.id.textView7)
        val button5 = findViewById<TextView>(R.id.textView8)
        val button6 = findViewById<TextView>(R.id.textView9)
        val button7 = findViewById<TextView>(R.id.textView10)
        val button8 = findViewById<TextView>(R.id.textView11)
        val button9 = findViewById<TextView>(R.id.textView12)

        button2.setOnClickListener {
            val intent = Intent(this, Continuewithoutlogin::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, Registrationform::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
                val intent = Intent(this, Registrationform::class.java)
            startActivity(intent)
        }
    }
}
