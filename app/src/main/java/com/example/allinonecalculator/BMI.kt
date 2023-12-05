package com.example.allinonecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class BMI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)
        calculateBMI()
    }
    fun calculateBMI(){
        val weight=findViewById<EditText>(R.id.weightEdit)
        val height=findViewById<EditText>(R.id.heightEdit)
        val calcBMI=findViewById<Button>(R.id.calcbmi)
        val resultTXT=findViewById<TextView>(R.id.resultTXT)
        calcBMI.setOnClickListener{
            val check1= weight.text.toString()
            val check2= height.text.toString()

            if(check1.isEmpty() || check2.isEmpty() ){
                Toast.makeText(this,"values cannot be empty", Toast.LENGTH_SHORT).show()
            }
            else{
                val addnum1= weight.text.toString().toDouble()
                val addnum2= height.text.toString().toDouble()
                 if (addnum1 >635 || addnum1<0){
                    Toast.makeText(this,"Add a reasonable weight",Toast.LENGTH_SHORT).show()
                }else if (addnum2 >272 || addnum2<50){
                    Toast.makeText(this,"Add a reasonable height",Toast.LENGTH_SHORT).show()
                }else{

                val result=addnum1/ (addnum2/100).pow(2)
                val BMIresult= String.format("%.2f",result)
                val bmiCategory= when{
                    result <18.5 -> "underweight"
                    result <25 ->"Normal weight"
                    result < 30 -> "Overweight"
                    else -> "Obese"
                }
                resultTXT.text = "BMI : $BMIresult\nCategory: $bmiCategory"
            }
    }
}}}