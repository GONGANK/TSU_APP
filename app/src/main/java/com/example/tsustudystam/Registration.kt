package com.example.tsustudystam

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.firebase.auth.ktx.actionCodeSettings
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.AuthResult
import com.google.android.gms.tasks.OnCompleteListener

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val button1 = findViewById<ImageButton>(R.id.imageButton)
        val button2 = findViewById<Button>(R.id.button6)
        val inputmail1 = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val inputpass1 = findViewById<EditText>(R.id.editTextTextPassword2)
        val inputpass2 = findViewById<EditText>(R.id.editTextTextPassword3)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        when {
        }
       /* button2.setOnClickListener {
            val actionCodeSettings = actionCodeSettings {
                // URL you want to redirect back to. The domain (www.example.com) for this
                // URL must be whitelisted in the Firebase Console.
                url = "https://www.example.com/finishSignUp?cartId=1234"
                // This must be true
                handleCodeInApp = true
                setIOSBundleId("com.example.ios")
                setAndroidPackageName(
                    "com.example.android",
                    true, /* installIfNotAvailable */
                    "12" /* minimumVersion */)
            }

            Firebase.auth.sendSignInLinkToEmail(inputmail1.getText().toString(), actionCodeSettings)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Log.d(TAG, "Email sent.")
                    }
                }

        }*/

        button2.setOnClickListener{

            //email or passwords are empty
            if (inputmail1.getText().toString().isEmpty() || inputpass1.getText().toString().isEmpty() || inputpass2.getText().toString().isEmpty()){
            val toast1 = Toast.makeText(applicationContext,"please enter your email and password", Toast.LENGTH_LONG)
            toast1.show()
        }
            //password do not match
            else if (inputpass1.getText().toString() != inputpass2.getText().toString())
            {
                val toast1 = Toast.makeText(applicationContext,"passwords do not match", Toast.LENGTH_LONG)
                toast1.show()
            }
            else if (inputpass1.getText().toString().length < 8)
            {
                val toast1 = Toast.makeText(applicationContext,"passwords must contain at least 8 characters", Toast.LENGTH_LONG)
                toast1.show()
            }

        }


    }




}