package com.example.playinglayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val kani_button: Button = findViewById(R.id.saveBtn)
        if( kani_button.text.equals("Back")){
            Log.d("ZZZ123", "Go Back & Destroy")
            finish()
        }else{
            val etFirstname: EditText = findViewById(R.id.firstName)
            val value = etFirstname.text.toString()
            Log.d("ZZZ123", "Save ${value} and pass to next")

            val thirdScreen = Intent(this, MainActivity2::class.java)
            thirdScreen.putExtra("Firstname", value)
            startActivity(thirdScreen)

        }
    }

}