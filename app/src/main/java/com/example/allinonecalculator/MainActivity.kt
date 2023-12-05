package com.example.allinonecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCalc= findViewById<Button>(R.id.CalcBTN)
        val btnBMI= findViewById<Button>(R.id.BMIBTN)
        val btnTip= findViewById<Button>(R.id.TipBTN)
        val btnOther= findViewById<Button>(R.id.Convertors)
        btnCalc.setOnClickListener{
            val intent= Intent(this, Calc::class.java)
            startActivity(intent)
        }
        btnBMI.setOnClickListener{
            val intent= Intent(this, BMI::class.java)
            startActivity(intent)
        }
        btnTip.setOnClickListener{
            val intent= Intent(this, Tip::class.java)
            startActivity(intent)
        }
        btnOther.setOnClickListener{
            val intent= Intent(this, ConvertorsHomePage::class.java)
            startActivity(intent)
        }
    }
}