package com.example.playinglayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val thisIntent: Intent = intent
        val getFirstname2: String = thisIntent.getStringExtra("Firstname").toString()
        Log.d("ZZZ125",getFirstname2)

        val tvName: TextView = findViewById(R.id.txtPassvalue)
        tvName.setText(getFirstname2)
    }
}