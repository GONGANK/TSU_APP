package com.example.tsustudystam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Registrationform : AppCompatActivity() {

    lateinit var gname : EditText
    lateinit var gsurname : EditText
    lateinit var gbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrationform)

        gname = findViewById(R.id.textView14)
        gsurname =findViewById(R.id.textView15)
        gbtn = findViewById(R.id.button7)

        gbtn.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("name", gname.text.toString())
            bundle.putString("surname", gsurname.text.toString())
            val intent = Intent(this, admin::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }


        val button1 = findViewById<ImageView>(R.id.imageButton)

        val languages = resources.getStringArray(R.array.Faculties)
        val languages2 = resources.getStringArray(R.array.Nationality)
        val languages3 = resources.getStringArray(R.array.Degree)

        button1.setOnClickListener {
            val intent = Intent(this, Faculties::class.java)
            startActivity(intent)
        }


        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner1)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Registrationform,
                        getString(R.string.selected_item) + " " +
                                "" + languages[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages2)
            spinner2.adapter = adapter

            spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Registrationform,
                        getString(R.string.selected_item) + " " +
                                "" + languages2[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }


        val spinner3 = findViewById<Spinner>(R.id.spinner3)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages3)
            spinner3.adapter = adapter

            spinner3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Registrationform,
                        getString(R.string.selected_item) + " " +
                                "" + languages3[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }


    }
}