package com.example.allinonecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConvertorsHomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convertors_home_page)
        val btnTemp= findViewById<Button>(R.id.TempBTN)
        val btnWeight= findViewById<Button>(R.id.WeightBTN)
        val btnHeight= findViewById<Button>(R.id.HeightBTN)

        btnTemp.setOnClickListener{
            val intent= Intent(this, TempConv::class.java)
            startActivity(intent)
        }
        btnWeight.setOnClickListener{
            val intent= Intent(this, WeightConv::class.java)
            startActivity(intent)
        }
        btnHeight.setOnClickListener{
            val intent= Intent(this, HeightConv::class.java)
            startActivity(intent)
        }

    }
}