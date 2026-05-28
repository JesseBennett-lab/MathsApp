package com.example.mymathapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val birthdayText = findViewById<EditText>(R.id.birthdayText)
        val totalText = findViewById<TextView>(R.id.totalText)
        val submitButton = findViewById<Button>(R.id.submitButton)

        var birthday = 14


        submitButton.setOnClickListener {
           val     

        }


        birthday = birthday + 10
        birthday = birthday * 3
        birthday = birthday - 5
        birthday = birthday \ 2













        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}