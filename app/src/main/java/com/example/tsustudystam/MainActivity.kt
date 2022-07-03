package com.example.tsustudystam

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.view.View
import android.widget.*
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

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
        val var2 = "ngongadze2000@gmail.com"
        val var3 = "Gonga2000"

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


        val auth = Firebase.auth
        val intent = intent
        val emailLink = intent.data.toString()


// Confirm the link is a sign-in with email link.
        if (auth.isSignInWithEmailLink(emailLink)) {
            // Retrieve this from wherever you stored it
            val email = "someemail@domain.com"

            // The client SDK will parse the code from the link for you.
            auth.signInWithEmailLink(email, emailLink)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Log.d(TAG, "Successfully signed in with email link!")
                        val result = task.result
                        // You can access the new user via result.getUser()
                        // Additional user info profile *not* available via:
                        // result.getAdditionalUserInfo().getProfile() == null
                        // You can check if the user is new or existing:
                        // result.getAdditionalUserInfo().isNewUser()
                    } else {
                        Log.e(TAG, "Error signing in with email link", task.exception)
                    }
                }
        }
        }
    }