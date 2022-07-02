package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<TextView>(R.id.Continue_without_login)
        val button2 = findViewById<TextView>(R.id.textView4)
        val button3 = findViewById<TextView>(R.id.textView3)
        val button4 = findViewById<TextView>(R.id.button)
        val showhidenbtn2= findViewById<ImageView>(R.id.imageView7)

        val var1 = findViewById<TextView>(R.id.editTextTextEmailAddress)
        val var4 = findViewById<EditText>(R.id.editTextTextPassword)

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
        val var2 = "nika"
        val var3 = "gng"

        button4.setOnClickListener {

            if (var1.getText().toString() == var2 && var4.getText().toString()== var3) {
                val intent = Intent(this, Continuewithoutlogin::class.java)
                startActivity(intent)
            }
            else
            {
                val toast1 = Toast.makeText(applicationContext,"incorrect Email or password", Toast.LENGTH_LONG)
                toast1.show()


            }

        }


        var x =0
        showhidenbtn2.setOnClickListener{
            if(x.equals(0)) {
                var4.transformationMethod = HideReturnsTransformationMethod.getInstance()
                x=1
            }
            else {
                var4.transformationMethod = PasswordTransformationMethod.getInstance()
                x = 0
            }
        }



        }
    }